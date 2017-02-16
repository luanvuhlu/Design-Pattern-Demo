package com.luanvv.design.strategy.demo1;

/**
 * Created by luanvv on 16/02/2017.
 */
public class Helicopter extends Traffic {
    public Helicopter() {
        setAlgorithm(new GoByFlying());
    }
}
