package com.iTech.notificationservice.controller;

import com.iTech.notificationservice.dto.MessageDTO;
import com.iTech.notificationservice.service.EmailService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotificationController {
    private final EmailService emailService;

    public NotificationController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send-notification")
    public void sendNotification(@RequestBody MessageDTO messageDTO) {
        emailService.sendEmail(messageDTO);
    }
}
