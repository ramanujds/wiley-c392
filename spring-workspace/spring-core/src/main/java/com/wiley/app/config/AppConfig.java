package com.wiley.app.config;

import com.wiley.app.service.AirtelSim;
import com.wiley.app.service.Phone;
import com.wiley.app.service.Sim;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.wiley.app.service"})
public class AppConfig {

}
