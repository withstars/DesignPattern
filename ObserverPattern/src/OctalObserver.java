/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-02-11
 * Time: 21:56
 * Mail: withstars@126.com
 */

/**
 * 观察者实现类
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("八进制为"+Integer.toOctalString(subject.getState()));
    }
}
