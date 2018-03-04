package cn.withstars;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-04
 * Time: 20:02
 * Mail: withstars@126.com
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color=color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("circle{Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius+"}");
    }
}
