package com.mjc.stage2;


import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.impl.RectangleObserver;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class MainClass {
    public static void main(String[] args) {
        Rectangle cube = new Rectangle(1, 4, 5);
        cube.addObserver(new RectangleObserver());
        cube.setSideA(5); //5, 5
        System.out.println("================================");
        cube.setSideB(7); //5, 7
        System.out.println(RectangleWarehouse.getInstance().get(1).getPerimeter());
        System.out.println(RectangleWarehouse.getInstance().get(1).getSquare());
    }
}

