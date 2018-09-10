package com.limk.cloud.microservicehystrixturbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class MicroserviceHystrixTurbineApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MicroserviceHystrixTurbineApplication.class).web(true).run(args);
    }
}
