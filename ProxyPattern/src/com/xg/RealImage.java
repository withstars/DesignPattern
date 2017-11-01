package com.xg;

public class RealImage implements Image {
    private String filename;

    RealImage(String filename){
        this.filename=filename;
        loadFromDisk(filename);
    }
    @Override
    public void display() {
        System.out.println(this.filename+"正在显示");
    }
    private void loadFromDisk(String filename){
        System.out.println(filename+"正在从磁盘加载...");
    }
}
