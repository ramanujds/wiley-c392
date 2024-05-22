package com.wiley.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("phone")
public class Phone {


    @Autowired
    @Qualifier("airtel")
    private Sim sim;

    @Value("${phone.model}")
    private String model;
    @Value("${phone.brand}")
    private String brand;
    @Value("${phone.price}")
    private float price;


    public Phone(Sim sim) {
        this.sim = sim;
    }

    public Phone(){
        System.out.println("Phone Bean Created");
    }

    public void setSim(Sim sim){
        this.sim=sim;
    }

    public void makeACall(){
        sim.call();
    }

    public void text(){
        sim.text();
    }

    public void browseInternet(){
        sim.browseInternet();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone{");
        sb.append("sim=").append(sim.getClass().getSimpleName());
        sb.append(", model='").append(model).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public void displayPhoneDetails(){
        System.out.println(toString());
    }
}
