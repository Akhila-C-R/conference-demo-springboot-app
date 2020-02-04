/*
package com.organizer.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){

        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conferencedb");
        builder.username("postgres");
        builder.password("post123");
        System.out.println("My custom datasource has been set and initialized");

        return builder.build();
    }
}
*/