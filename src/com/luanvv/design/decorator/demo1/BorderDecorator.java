package com.luanvv.design.decorator.demo1;

/**
 * Created by luanvv on 16/02/2017.
 */
public class BorderDecorator extends Decorator {
    public BorderDecorator(Widget widget) {
        super(widget);
    }

    public void draw() {
        super.draw();
        System.out.println("  Have a Border");
    }
}
