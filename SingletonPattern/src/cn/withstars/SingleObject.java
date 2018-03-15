package cn.withstars;

/**
 *  单例模式 急加载
 */
public class SingleObject {
    private static SingleObject singleObject=new SingleObject();

    private SingleObject(){

    };

    public static SingleObject getSingleObject(){
        return singleObject;
    }

    public void sendMessage(){
        System.out.println("Hello,world");
    }
}
