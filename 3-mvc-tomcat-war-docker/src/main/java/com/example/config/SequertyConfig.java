//package com.example.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SequertyConfig extends WebSecurityConfigurerAdapter{
//
//	@Autowired
//    public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth.inMemoryAuthentication().withUser("admin").password("admin")
//                .roles("USER", "ADMIN");
//    } 
//	
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/h2-console/**").permitAll()
//                .antMatchers("/","/studentInsert").access("hasRole('USER')").and()
//                .formLogin();
//        
//        http.csrf().disable();
//        http.headers().frameOptions().disable();
//    }
//}
