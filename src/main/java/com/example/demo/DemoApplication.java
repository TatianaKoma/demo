package com.example.demo;

import com.example.demo.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication
                .run(DemoApplication.class, args);
        PersonService bean = context.getBean(PersonService.class);
        bean.callTransactionalMethodsWithoutTransaction();
        bean.callTransactionalMethodsWithTransaction();
    }
}
