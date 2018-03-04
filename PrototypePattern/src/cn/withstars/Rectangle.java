package cn.withstars;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-04
 * Time: 19:35
 * Mail: withstars@126.com
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }


}
