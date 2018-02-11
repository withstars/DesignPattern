import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-02-11
 * Time: 21:49
 * Mail: withstars@126.com
 */

/**
 * 被观察者
 */
public class Subject {

    //保存所有观察者
    private List<Observer> observerList=new ArrayList<Observer>();
    //状态
    private int state;

    //状态改变时，通知所有观察者
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public int getState() {
        return state;
    }

    //注册观察者
    public void attach(Observer observer){
        observerList.add(observer);
    }
    //通知所有观察者
    public void notifyAllObservers(){
        for (Observer observer : observerList){
            observer.update();
        }
    }

}
