package com.smile.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.smile.controller","com.smile.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
