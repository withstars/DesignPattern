package com.xg;

public class FactoryPatternDemo {
    public static void main(String args[]){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("square");
        Shape shape2=shapeFactory.getShape("rectangle");
        shape1.draw();
        shape2.draw();
    }
}
