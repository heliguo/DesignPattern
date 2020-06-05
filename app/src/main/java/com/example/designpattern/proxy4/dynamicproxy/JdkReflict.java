package com.example.designpattern.proxy4.dynamicproxy;

import com.example.designpattern.proxy4.Moveable;
import com.example.designpattern.proxy4.Tank;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author:lgh on 2020/6/5 19:42
 */
public class JdkReflict {

    public static void main(String[] args) {
        Tank tank = new Tank();

        //reflection 通过二进制字节码分析类的属性和方法
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");
        Moveable m = (Moveable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Moveable.class}, new LogHandler(tank) );
        m.move();
}

    static class LogHandler implements InvocationHandler {

        Tank tank;

        public LogHandler(Tank tank) {
            this.tank = tank;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(method.getName() + "   start...");
            Object o = method.invoke(tank, args);
            System.out.println(method.getName() + "   end...");
            return o;
        }
    }

}
