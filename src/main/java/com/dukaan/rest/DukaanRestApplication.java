package com.dukaan.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DukaanRestApplication {
  public static void main(String[] args) {
      SpringApplication.run(DukaanRestApplication.class, args);
  }

//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**").allowedOrigins("http://localhost:3000").allowedMethods("*");
//            }
//        };
//    }
}
