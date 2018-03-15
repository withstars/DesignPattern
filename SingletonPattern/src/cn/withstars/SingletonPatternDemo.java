package cn.withstars;

public class SingletonPatternDemo {
    public  static void main(String args[]){
        SingleObject singleObject=SingleObject.getSingleObject();
        singleObject.sendMessage();

        SingleObject2 singleObject2=SingleObject2.getSingleObject();
        singleObject2.sendMessage();

        SingleObject3 singleObject3=SingleObject3.getSingleObject();
        singleObject3.sendMessage();
    }
}
