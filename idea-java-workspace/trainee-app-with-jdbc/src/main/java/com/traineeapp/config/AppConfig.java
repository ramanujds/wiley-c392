package com.traineeapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@ComponentScan(basePackages = {"com.traineeapp"})
@PropertySource("app.properties")
public class AppConfig {

    @Value("${db.url}")
    private String url;
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;

    @Bean
    @Scope("prototype")
    public Connection getConnectionBean() throws SQLException {
        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }

}
