package 策略模式.instances;


import 策略模式.behavior.FlyBehavior;
import 策略模式.behavior.QuackBehavior;

public abstract class Duck {

    //飞行行为
    FlyBehavior flyBehavior;

    //叫
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    //游泳
    public void swim() {
        System.out.println("鸭子默认游泳！");
    }

    //display
    public abstract void display();


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
