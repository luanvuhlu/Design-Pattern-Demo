package com.luanvv.design.decorator.demo2;

/**
 * Created by luanvv on 16/02/2017.
 */
public class Disk implements IComputer {
    private IComputer computer;

    public Disk(IComputer computer) {
        this.computer = computer;
    }

    @Override
    public String description() {
        return computer.description() + " and a disk";
    }
}
