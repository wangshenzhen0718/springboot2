package com.wang.boot;

import com.wang.boot.bean.Car;
import com.wang.boot.bean.User;
import com.wang.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        User user01 = context.getBean("user01", User.class);
        User user02 = context.getBean("user01", User.class);
        System.out.println(user01==user02);


        //proxyBeanMethods = false
        MyConfig myConfig = context.getBean(MyConfig.class);
        User user = myConfig.user01();
        User user1 = myConfig.user01();
        System.out.println(user==user1);

        boolean b = context.containsBean("user01");

        System.out.println("容器中是否包含beam："+b);

        Car car = context.getBean("car", Car.class);
        System.out.println(car);



    }
}
