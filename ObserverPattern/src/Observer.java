/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-02-11
 * Time: 21:50
 * Mail: withstars@126.com
 */

/**
 * 观察者抽象类
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
