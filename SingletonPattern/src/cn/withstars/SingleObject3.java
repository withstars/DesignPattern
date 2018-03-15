package cn.withstars;

/**
 *  单例模式 懒加载 线程安全
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-15
 * Time: 16:24
 * Mail: withstars@126.com
 */
public class SingleObject3 {
    private static SingleObject3 singleObject3;

    private SingleObject3(){

    };

    synchronized public static SingleObject3 getSingleObject(){
        if (singleObject3 == null){
            singleObject3 = new SingleObject3();
        }
        return singleObject3;
    }

    public void sendMessage(){
        System.out.println("Hello,world");
    }
}
