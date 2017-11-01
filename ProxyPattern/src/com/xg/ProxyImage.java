package com.xg;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    ProxyImage(String filename){
        this.filename=filename;
    }
    @Override
    public void display() {
        if (realImage == null){
            realImage=new RealImage(filename);
        }
        realImage.display();
    }
}
