package org.puddingjk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//@SpringBootApplication
@EnableEurekaClient
public class MicroserviceEurekaClientApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(MicroserviceEurekaClientApplication.class, args);
//    }

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMM");
        Date date=new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.MONTH,-1);
        date=calendar.getTime();
        Long datel = Long.parseLong(formatter.format(date));
        System.out.println(datel);
    }

}
