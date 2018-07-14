package com.nzt.ticketserviceclient;

import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

@XSlf4j
@Component
public class TcpClient implements ApplicationRunner {


    private static final String REQUEST_EMAIL = "request-email";
    private static final String REQUEST_SEATS = "request-seats";
    private static final String CONFIRM_RESERVATION ="reserve";

    private static final String PROMPT_1 = "Enter your email to reserve seats: (Type exit or quit to end session)";
    private static final String PROMPT_2 = "Enter the number of seats:";
    private static final String PROMPT_3 = "Reserve your seats? (Y/N)";

    @Value("${tcp.server.host}")
    private String host;

    @Value("${tcp.server.port}")
    private Integer port;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        try {
            Socket socket = new Socket(host,port);
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader rd = new BufferedReader(isr);

            String line = rd.readLine();



        }
        catch(Exception e){

        }


    }
}
