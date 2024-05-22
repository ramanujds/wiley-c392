package com.wiley.app.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jio")
public class JioSim implements Sim{

    @Value("${jio.number}")
    private long phoneNo;
    @Value("${jio.serviceProvider}")
    private String serviceProvider;

    public JioSim() {
        System.out.println("Jio Sim Bean Created");
    }

    @Override
    public void call() {
        System.out.println("Calling using "+serviceProvider+" : "+phoneNo);
    }

    @Override
    public void text() {
        System.out.println("Text sent : "+serviceProvider);
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing Internet with "+serviceProvider);
    }

    public long getPhoneNo() {
        return phoneNo;
    }
}
