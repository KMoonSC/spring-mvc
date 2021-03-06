package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * created by xuyuan 18/8/18
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.spring")
public class WebConfig extends WebMvcConfigurerAdapter {


}
