package com.suanfa.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("helloworld!!");
        ArrayList list = new ArrayList();
        list.add("刘德华");
        list.add("刘德华");
        list.add("刘德华");
        list.add("刘德华");
        list.add(0, 123);
        for (Object s : list) {
            System.out.println(s);
        }
    }

    public void method() {
        int num = 10;
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
