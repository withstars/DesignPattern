package cn.withstars;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-04
 * Time: 19:41
 * Mail: withstars@126.com
 */
public class ShapeCache {

    private static ConcurrentHashMap<String , Shape> shapeMap = new ConcurrentHashMap<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = null;
        try {
            cachedShape = (Shape)shapeMap.get(shapeId).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }finally {
            return cachedShape ;
        }
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);



    }
}
