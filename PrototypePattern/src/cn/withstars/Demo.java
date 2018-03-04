package cn.withstars;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-04
 * Time: 19:51
 * Mail: withstars@126.com
 */
public class Demo {

    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape cloneShape = (Shape)ShapeCache.getShape("1");
        System.out.println("Shape : "+cloneShape.getType());

        Shape cloneShape2 = (Shape)ShapeCache.getShape("2");
        System.out.println("Shape : "+cloneShape2.getType());

        Shape cloneShape3 = (Shape)ShapeCache.getShape("3");
        System.out.println("Shape : "+cloneShape3.getType());


    }
}
