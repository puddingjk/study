package org.puddingjk.factory.exa;

public class User {
    private final static User user = new User();

    String name ;
    Integer age;
    static User u ;
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

    private User(){

    }
    //　饿汉式
    public static User getUser(){
        return  user;
    }

    // 懒汉式
    public static User getUser1(){
        if(u==null){
            synchronized (User.class){
                if(u==null){
                    u = new User();
                }
            }
        }
        return  u;
    }
}
