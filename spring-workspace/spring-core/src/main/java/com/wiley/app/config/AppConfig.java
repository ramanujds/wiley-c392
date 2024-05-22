package com.wiley.app.config;

import com.wiley.app.service.AirtelSim;
import com.wiley.app.service.Phone;
import com.wiley.app.service.Sim;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Sim getSimBean(){
        return new AirtelSim();
    }

    @Bean
    public Phone getPhoneBean(){
        Phone phone = new Phone();
        phone.setSim(getSimBean());
        return phone;
    }


}
