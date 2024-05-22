package com.wiley.app.service;

import org.springframework.stereotype.Component;

@Component
public class AirtelSim implements Sim{


    public AirtelSim() {
        System.out.println("Airtel Sim Bean Created");
    }

    @Override
    public void call() {
        System.out.println("Calling using Airtel");
    }

    @Override
    public void text() {
        System.out.println("Text sent : Airtel");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing Internet with Airtel");
    }
}
