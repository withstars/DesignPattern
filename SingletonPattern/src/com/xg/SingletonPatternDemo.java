package com.xg;

public class SingletonPatternDemo {
    public  static void main(String args[]){
        SingleObject singleObject=SingleObject.getSingleObject();
        singleObject.sendMessage();
    }
}
