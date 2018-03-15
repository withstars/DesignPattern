package cn.withstars;

/**
 *  单例模式 懒加载  线程不安全
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-15
 * Time: 16:21
 * Mail: withstars@126.com
 */
public class SingleObject2 {
    private static SingleObject2 singleObject2;

    private SingleObject2(){

    };

    public static SingleObject2 getSingleObject(){
        if (singleObject2 == null){
            singleObject2 = new SingleObject2();
        }
        return singleObject2;
    }

    public void sendMessage(){
        System.out.println("Hello,world");
    }
}
