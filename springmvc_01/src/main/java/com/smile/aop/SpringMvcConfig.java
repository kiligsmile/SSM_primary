package com.smile.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.smile.controller","com.smile.aop"})
@EnableWebMvc
public class SpringMvcConfig {
}
