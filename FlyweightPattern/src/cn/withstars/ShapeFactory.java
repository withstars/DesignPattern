package cn.withstars;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-04
 * Time: 20:06
 * Mail: withstars@126.com
 */
public class ShapeFactory {

    private static final ConcurrentHashMap<String,Shape> circleMap = new ConcurrentHashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color :" + color);
        }
        return circle;

    }
}
