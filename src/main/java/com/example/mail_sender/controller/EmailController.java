package com.example.mail_sender.controller;

import com.example.mail_sender.model.Email;
import com.example.mail_sender.service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;

    }

    @PostMapping("/send-email")
    public void sendEmail(@RequestBody Email email) {
        emailService.sendEmail(email);
    }
}
