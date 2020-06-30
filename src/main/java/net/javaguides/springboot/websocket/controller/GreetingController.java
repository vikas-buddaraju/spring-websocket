package net.javaguides.springboot.websocket.controller;

import net.javaguides.springboot.websocket.service.LoadService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import net.javaguides.springboot.websocket.model.HelloMessage;

@Controller
public class GreetingController {

    private LoadService service;

    @MessageMapping("/hello")
    //@SendTo("/topic/greetings")
    public void greeting( HelloMessage message)
          throws InterruptedException
    {
        service.getLoad();
    }
}
