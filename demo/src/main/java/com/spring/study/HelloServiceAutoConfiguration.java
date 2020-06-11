package com.spring.study;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.spring.study.module"})
public class HelloServiceAutoConfiguration {
}
