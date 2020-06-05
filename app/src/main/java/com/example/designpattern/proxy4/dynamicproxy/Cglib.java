package com.example.designpattern.proxy4.dynamicproxy;

import com.example.designpattern.proxy4.Tank;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * author:lgh on 2020/6/5 21:25
 * cglib实现动态代理不需要接口，但不能代理final类，因为final类无法生成子类
 */
public class Cglib {

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new LogMethodInterceptor());
        Tank tank = ((Tank) enhancer.create());
        tank.move();

    }

    static class LogMethodInterceptor implements MethodInterceptor {

        @Override
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            System.out.println("before");
            System.out.println(obj.getClass().getSuperclass().getName());
            Object o = proxy.invokeSuper(obj, args);
            System.out.println("after");
            return o;
        }
    }


}
