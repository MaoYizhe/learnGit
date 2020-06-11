package com.spring.study.module;

        import org.springframework.stereotype.Component;

        @Component
        public class HelloServiceImpl implements HelloService {
        public String sayHello(){
        return "hello world!";
        }
        }
