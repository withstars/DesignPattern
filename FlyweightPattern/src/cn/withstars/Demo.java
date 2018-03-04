package cn.withstars;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-04
 * Time: 20:11
 * Mail: withstars@126.com
 */
public class Demo {

    private static final String[] colors = new String[]{"Red","Green","Blue","White","Black","Pink"};
    public static void main(String[] args){
        for (int i = 0;i<20;i++){
            Circle circle = (Circle) ShapeFactory.getCircle( getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    public static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }
    public static int getRandomX(){
        return (int)(Math.random()*100);
    }

    public static int getRandomY(){
        return (int)(Math.random()*100);
    }
}
