package com.equifax.dev.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConf extends WebSecurityConfigurerAdapter{
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
    		.httpBasic()
            .and()
            .authorizeRequests()
            .antMatchers(HttpMethod.GET, "/api/v1/**").permitAll()                
            .and()
            .csrf().disable()
            .formLogin().disable();
    }	
}
