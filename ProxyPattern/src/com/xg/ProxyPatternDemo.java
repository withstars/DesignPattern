package com.xg;

public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image=new ProxyImage("user_icon_1.jpg");
        image.display();
    }
}
