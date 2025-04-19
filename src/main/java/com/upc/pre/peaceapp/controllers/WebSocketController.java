package com.upc.pre.peaceapp.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
    @MessageMapping("/send")
    @SendTo("/newLocation")
    public String broadcastNewLocation(String message) {
        return message;
    }
}
