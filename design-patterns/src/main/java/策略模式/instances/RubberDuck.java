package 策略模式.instances;


import 策略模式.impl.FlyNoWay;
import 策略模式.impl.Squack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior=new FlyNoWay();
        quackBehavior=new Squack();
    }

    @Override
    public void swim() {
        System.out.println("橡皮鸭游泳");
    }

    @Override
    public void display() {
        System.out.println("我是个橡皮鸭!");
    }

}

