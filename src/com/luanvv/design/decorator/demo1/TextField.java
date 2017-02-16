package com.luanvv.design.decorator.demo1;

/**
 * Created by luanvv on 16/02/2017.
 */
public class TextField implements Widget {
    private int width;
    private int height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("TextField: " + width + ", " + height);
    }
}
