package com.luanvv.design.decorator.demo1;

/**
 * Created by luanvv on 16/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        Widget specialWidget = new BorderDecorator(new ScrollDecorator(new TextField(100, 50)));
        specialWidget.draw();
    }
}
