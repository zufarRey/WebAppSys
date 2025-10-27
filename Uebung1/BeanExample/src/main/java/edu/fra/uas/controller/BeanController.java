package edu.fra.uas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.service.MessageService;

@Component
public class BeanController {
    @Autowired // gebe mir das bean also Obj vom typ unten  vom spring container und instanziere es 
    private MessageService messageService;

    public String putMessage(String message) {
        messageService.setMessage(" put messgae: " + message);
        return messageService.getMessage();
}

}
