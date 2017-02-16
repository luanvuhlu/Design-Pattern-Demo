package com.luanvv.design.strategy.demo1;

/**
 * Created by luanvv on 16/02/2017.
 */
public class Main {
    public static void main(String[] args){
        MotoBike motoBike = new MotoBike();
        Helicopter helicopter = new Helicopter();
        Flash flash = new Flash();

        motoBike.go();
        helicopter.go();
        flash.go();
    }
}
