package com.example.designpattern;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.designpattern.chainofresponsibility8.FilterChain;
import com.example.designpattern.chainofresponsibility8.IFilter;
import com.example.designpattern.chainofresponsibility8.Msg;
import com.example.designpattern.chainofresponsibility8.NumFilter;
import com.example.designpattern.chainofresponsibility8.SensitiveFilter;
import com.example.designpattern.composite10.BranchNode;
import com.example.designpattern.composite10.LeafNode;
import com.example.designpattern.composite10.Node;
import com.example.designpattern.composite10.TreePrint;
import com.example.designpattern.decorator7.AbstractBattercake;
import com.example.designpattern.decorator7.BattercakeDec;
import com.example.designpattern.decorator7.EggBattercakeDecorator;
import com.example.designpattern.decorator7.SausageDecorator;
import com.example.designpattern.factory3.Car;
import com.example.designpattern.factory3.CarFactory;
import com.example.designpattern.factory3.Moveable;
import com.example.designpattern.factory3.Plane;
import com.example.designpattern.factory3.PlaneFactory;
import com.example.designpattern.factory3.VehicleSimpleFactory;
import com.example.designpattern.factory3.abstractfactory.Ak47;
import com.example.designpattern.factory3.abstractfactory.Bread;
import com.example.designpattern.factory3.abstractfactory.Broom;
import com.example.designpattern.factory3.abstractfactory.Car1;
import com.example.designpattern.factory3.abstractfactory.MagicFactory;
import com.example.designpattern.factory3.abstractfactory.MagicStick;
import com.example.designpattern.factory3.abstractfactory.ModernFactory;
import com.example.designpattern.factory3.abstractfactory.MushRoom;
import com.example.designpattern.strategy2.Dog;
import com.example.designpattern.strategy2.DogComparator;
import com.example.designpattern.strategy2.Sorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 策略模式
         */
        Dog[] dogs = {new Dog(5), new Dog(3), new Dog(1)};
        Sorter<Dog> sorter = new Sorter<>();
        DogComparator dogMyComparator = new DogComparator();
        sorter.sort(dogs, dogMyComparator);
        Log.e("TAG", "onCreate: " + Arrays.toString(dogs));
        /**
         * 工厂方法
         */
        Moveable moveable = new Car();
        Moveable moveable1 = new Plane();
        moveable.go();
        moveable1.go();

        VehicleSimpleFactory factory = new VehicleSimpleFactory();
        factory.createCar().go();
        factory.createPlane().go();

        Moveable m = new PlaneFactory().createPlane();
        m.go();

        Moveable m1 = new CarFactory().creat();
        m1.go();

        /**
         * 抽象工厂
         */

        Car1 car1 = new Car1();
        car1.go();
        Ak47 ak47 = new Ak47();
        ak47.shoot();
        Bread bread = new Bread();
        bread.printName();
        MagicStick magicStick = new MagicStick();
        magicStick.shoot();
        MushRoom mushRoom = new MushRoom();
        mushRoom.printName();
        Broom broom = new Broom();
        broom.go();

        ModernFactory modernFactory = new ModernFactory();
        modernFactory.createFood().printName();
        modernFactory.creatVehicle().go();
        modernFactory.createWeapon().shoot();

        MagicFactory magicFactory = new MagicFactory();
        magicFactory.createFood().printName();
        magicFactory.creatVehicle().go();
        magicFactory.createWeapon().shoot();

        /**
         * 装饰者
         */
        AbstractBattercake abstractBattercake;
        abstractBattercake = new BattercakeDec();
        abstractBattercake = new EggBattercakeDecorator(abstractBattercake);
        abstractBattercake = new SausageDecorator(abstractBattercake);

        /**
         * 责任链模式,处理敏感词汇
         */
        Msg msg = new Msg();
        msg.setMsg("123456789敏感词汇");

        String r = msg.getMsg();
        r = r.replace("1", "a");
        r = r.replace("2", "b");
        new NumFilter().doFilter(r);
        new SensitiveFilter().doFilter(r);

        List<IFilter> filters = new ArrayList<>();
        filters.add(new NumFilter());
        filters.add(new SensitiveFilter());

        for (IFilter filter : filters) {
            filter.doFilter(r);
        }

        FilterChain fc = new FilterChain();
//        fc.add(new NumFilter());
//        fc.add(new SensitiveFilter());
        //链式调用
        fc.add(new NumFilter()).add(new SensitiveFilter());
        FilterChain fc2 = new FilterChain();
        fc2.add(new NumFilter());
        fc.add(fc2);

        fc.doFilter(r);

        /**
         * 组合模式
         */
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node c11 = new LeafNode("c11");
        Node c12 = new LeafNode("c12");
        BranchNode b21 = new BranchNode("section21");
        Node c211 = new LeafNode("c211");
        Node c212 = new LeafNode("c212");

        root.add(chapter1);
        root.add(chapter2);

        chapter1.add(c11);
        chapter1.add(c12);

        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);

        TreePrint.print(root,0);
    }
}
