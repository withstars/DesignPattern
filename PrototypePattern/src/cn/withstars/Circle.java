package cn.withstars;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-04
 * Time: 19:35
 * Mail: withstars@126.com
 */
public class Circle extends Shape {
        public Circle(){
            type = "Circle";
        }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
