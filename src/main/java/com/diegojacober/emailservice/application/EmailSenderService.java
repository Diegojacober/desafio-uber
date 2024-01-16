package com.diegojacober.emailservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegojacober.emailservice.adapters.EmailSenderGateway;
import com.diegojacober.emailservice.core.EmailSenderUseCase;
import com.diegojacober.emailservice.infra.ses.SesEmailSender;

@Service
public class EmailSenderService implements EmailSenderUseCase{

    @Autowired
    private EmailSenderGateway emailSenderGateway;
    // private SesEmailSender emailSenderGateway;
    

    @Override
    public void sendEmail(String to, String subject, String body) {
        emailSenderGateway.sendEmail(to, subject, body);
    }
    
}
