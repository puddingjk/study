package org.puddingjk.factory.exa;

public class Main {
    public static void main(String[] args) {
//        User user = User.getUser();
//        user.setAge(2);
//        User user1 = User.getUser();
//        user1.setAge(3);
//        System.out.println(user.getAge());
//        System.out.println(user1.getAge());
//        System.out.println(user==user);




        Runnable r = ()->{
            User user1 = User.getUser1();
            System.out.println(Thread.currentThread().getName()+" "+user1.hashCode());
        };
        Runnable r1 =()->{
            User user2 = User.getUser1();
            System.out.println(Thread.currentThread().getName()+" "+user2.hashCode());
        };
        Thread t = new Thread(r);
        Thread t1 = new Thread(r1);
        t.start();
        t1.start();


    }
}
