package 策略模式.impl;


import 策略模式.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不能飞！");
    }
}
