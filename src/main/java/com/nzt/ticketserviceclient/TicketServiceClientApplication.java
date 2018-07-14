package com.nzt.ticketserviceclient;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config.properties")
public class TicketServiceClientApplication {

    public static void main(String[] args) {

       new SpringApplicationBuilder(TicketServiceClientApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
