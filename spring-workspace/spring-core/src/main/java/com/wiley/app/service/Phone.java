package com.wiley.app.service;

public class Phone {


    private Sim sim;

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



}
