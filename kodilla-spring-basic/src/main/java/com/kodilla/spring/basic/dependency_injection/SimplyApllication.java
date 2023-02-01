package com.kodilla.spring.basic.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class SimplyApllication {
    private MessageService messageService;

    public SimplyApllication(MessageService messageService) {
        this.messageService = messageService;
    }
    public String processMessage (String message, String receiver){
        if(checkReceiver(receiver)){
            this.messageService.send(message,receiver);
        }
        return null;
    }
    private boolean checkReceiver (String receiver){
        return receiver != null && !receiver.isEmpty();
    }
}
