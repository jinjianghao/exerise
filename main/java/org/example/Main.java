package main.java.org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        for(Object o : list){
            System.out.println(o);
        }
//        System.out.println(list.toString());
//        System.out.println(list.toString());
//        System.out.println(list.toString());
//        System.out.println(list.toString());
//
//
//        List<String> list1 = new ArrayList<String>();
//        list1.add("a");
//        list1.add("b");
//        list1.add("c");
//        System.out.println(Arrays.toString(list1.toArray()));

    }
}