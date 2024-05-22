package com.wiley.app.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("airtel")
@Scope("prototype")
@Primary
public class AirtelSim implements Sim{


    @Value("${airtel.number}")
    private long phoneNo;
    @Value("${airtel.serviceProvider}")
    private String serviceProvider;

    public AirtelSim() {
        System.out.println("Airtel Sim Bean Created");
        System.out.println("Phone No. : "+phoneNo);
        System.out.println("Service Provider : "+serviceProvider);
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

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
