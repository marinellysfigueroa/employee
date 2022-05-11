package com.mefa.employee.controller;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@EnableResourceServer
@RestController
@CrossOrigin(origins = "*")
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http.cors().and()
                .authorizeRequests().antMatchers("/oauth/token").permitAll();
        http.requestMatchers().antMatchers("/employee")
                .and().authorizeRequests().antMatchers("/employee")
                .access("hasRole ('USER')");

    }

}
