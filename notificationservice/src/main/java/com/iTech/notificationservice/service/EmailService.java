package com.iTech.notificationservice.service;

import com.iTech.notificationservice.dto.MessageDTO;

public interface EmailService {
    void sendEmail(MessageDTO messageDTO);
}

