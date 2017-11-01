package com.xg;

public class IteratorPatternDemo {
    public static void main(String[] args){
        NameRepository nameRepository=new NameRepository();

        for (Iterator itr = nameRepository.getIterator();itr.hasNext();){
            String name=(String) itr.next();
            System.out.println(name);
        }
    }
}
