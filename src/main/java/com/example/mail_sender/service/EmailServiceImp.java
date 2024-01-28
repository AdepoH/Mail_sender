package com.example.mail_sender.service;

import com.example.mail_sender.model.Email;
import com.example.mail_sender.repository.EmailRepository;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class EmailServiceImp implements EmailService {

    private final Email email;
    private final EmailRepository emailRepository;

    public EmailServiceImp(Email email, EmailRepository emailRepository) {
        this.email = email;
        this.emailRepository = emailRepository;
    }

    @Override
    public void sendEmail(Email email) {

        try {
            // Create a message
            Message message = new MimeMessage(body);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Hello from JavaMail");
            message.setText("This is a test email sent using JavaMail.");

            // Send the message
            Transport.send(message);

            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
            System.err.println("Failed to send email.");
        }
    }
}
