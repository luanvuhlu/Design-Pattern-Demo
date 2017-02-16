package com.luanvv.design.decorator.demo2;

/**
 * Created by luanvv on 16/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("You're getting a " + new CD(new CD(new Monitor(new Disk(computer)))).description());
    }
}
