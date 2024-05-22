package com.wiley.app;

import com.wiley.app.config.AppConfig;
import com.wiley.app.service.AirtelSim;
import com.wiley.app.service.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Phone phone = context.getBean(Phone.class);

        phone.browseInternet();


    }

}
