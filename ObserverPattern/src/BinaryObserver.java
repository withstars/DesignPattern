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
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("二进制为"+Integer.toBinaryString(subject.getState()));
    }
}
