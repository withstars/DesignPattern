package cn.withstars;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-04
 * Time: 19:00
 * Mail: withstars@126.com
 */
public class VegBurger extends Burger {



    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg burger";
    }
}
