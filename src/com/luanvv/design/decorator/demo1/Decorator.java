package com.luanvv.design.decorator.demo1;

/**
 * Created by luanvv on 16/02/2017.
 */
public abstract class Decorator implements Widget {
    private Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    public void draw() {
        widget.draw();
    }
}
