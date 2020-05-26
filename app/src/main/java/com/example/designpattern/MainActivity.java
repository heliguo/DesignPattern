package com.example.designpattern;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

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

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //策略模式
        Dog[] dogs = {new Dog(5), new Dog(3), new Dog(1)};
        Sorter<Dog> sorter = new Sorter<>();
        DogComparator dogMyComparator = new DogComparator();
        sorter.sort(dogs, dogMyComparator);
        Log.e("TAG", "onCreate: " + Arrays.toString(dogs));
        //工厂模式
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
        //抽象工厂
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

    }
}
