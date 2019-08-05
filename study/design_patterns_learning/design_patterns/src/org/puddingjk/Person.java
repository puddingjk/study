package org.puddingjk;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{
    // 饿汉式
//    private static  final  Person p = new Person();
    private String name;
    private Integer age;
    private List<Integer> list ;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    //    private static Person p ;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    private Person(){
//
//    }
//    public static Person getPerson(){
//        return  p;
//    }


//    public static  Person getPerson(){
//       if(p==null){
//           synchronized (Person.class){
//               if(p==null){
//                   p =new Person();
//               }
//           }
//       }
//       return  p;
//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                '}';
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person p2 = (Person) super.clone();
        List list2 = new ArrayList();
        for (int i = 0; i <list.size() ; i++) {
            list2.add(list.get(i));
        }
        p2.setList(list2);

        return  p2;
    }
}
