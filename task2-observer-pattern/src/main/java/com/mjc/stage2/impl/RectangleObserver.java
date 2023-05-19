package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle = event.getSource();
        double side = rectangle.getSideA();
        double side2 = rectangle.getSideA();
        RectangleWarehouse.getInstance().put(rectangle.getId(),
                new RectangleValues(side * side2, side * 2 + side2 + 2));
    }
}
