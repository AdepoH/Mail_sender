package com.example.mail_sender.repository;

import com.example.mail_sender.model.Email;

public interface EmailRepository {
    void sendEmail(Email email);

}
