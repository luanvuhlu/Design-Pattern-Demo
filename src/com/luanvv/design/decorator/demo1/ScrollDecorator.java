package com.luanvv.design.decorator.demo1;

/**
 * Created by luanvv on 16/02/2017.
 */
public class ScrollDecorator extends Decorator {
    public ScrollDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("  Have a Scroll");
    }
}
