package com.example.demo.config;

import com.example.demo.api.DemoApi;
import com.example.demo.providers.DemoApiImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {

    //@Bean
    //public DemoApi demoApi() {
    //    return new DemoApiImpl();
    //}


}
