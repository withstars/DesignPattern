package com.xg;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        else if (shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        else {
            System.out.print("没有该图形!");
        }
        return null;
    }

}
