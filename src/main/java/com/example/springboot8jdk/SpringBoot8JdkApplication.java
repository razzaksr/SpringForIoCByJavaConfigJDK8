package com.example.springboot8jdk;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringBoot8JdkApplication {
    public static void main(String[] args) {
        //SpringApplication.run(SpringBoot8JdkApplication.class, args);
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ComponentConfig.class);
        Servicing servicing=context.getBean(Servicing.class);
        servicing.display();
    }

}
