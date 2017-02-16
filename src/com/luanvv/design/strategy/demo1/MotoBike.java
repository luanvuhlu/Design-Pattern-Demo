package com.luanvv.design.strategy.demo1;

/**
 * Created by luanvv on 16/02/2017.
 */
public class MotoBike extends Traffic {
    public MotoBike() {
        setAlgorithm(new GoByDriving());
    }
}
