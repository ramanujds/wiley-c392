package com.wiley.app.config;

import com.wiley.app.service.AirtelSim;
import com.wiley.app.service.Phone;
import com.wiley.app.service.Sim;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("app.yml")
@ComponentScan(basePackages = {"com.wiley.app"})
public class AppConfig {

}
