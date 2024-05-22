package com.wiley.app;

import com.wiley.app.config.AppConfig;
import com.wiley.app.service.AirtelSim;
import com.wiley.app.service.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Phone phone1 = context.getBean("phone",Phone.class);

        phone1.setModel("iPhone 15 Pro");

        phone1.browseInternet();

        phone1.displayPhoneDetails();

        Phone phone2 = context.getBean("phone",Phone.class);

        phone2.displayPhoneDetails();


    }

}
