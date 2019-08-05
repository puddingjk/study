package org.puddingjk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Person p = Person.getPerson();
//        p.setAge(22);
//        Person p1 = Person.getPerson();
//        System.out.println(p.getAge() ==p1.getAge());
        // 原型模式
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        Person p = new Person();
        p.setAge(22);
        p.setName("aaa");
        p.setList(list);
        System.out.println(p.toString());
        try {
            Person p2 = p.clone();
            System.out.println(p==p2);
            p2.setName("nnnn");
            list.remove(0);
            System.out.println("p:"+p.toString());
            System.out.println(p2.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // 浅克隆 深克隆


    }
}
