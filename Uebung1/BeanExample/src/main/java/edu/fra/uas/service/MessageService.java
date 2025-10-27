package edu.fra.uas.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import edu.fra.uas.BeanExampleApplication;

@Component
public class MessageService {
    //1.8 aufgabe ende 
    private static final Logger log =LoggerFactory.getLogger(BeanExampleApplication.class);


    private String message;

    public String getMessage(){
        //1.8 nutzen logger um zu protokollieren was passiert 
          log.debug("getMessage() wurde aufgerufen – aktueller Wert: {}", message);
        return message;
    }
    public void setMessage(String message){
          log.debug("setMessage() wurde aufgerufen – neuer Wert: {}", message);
        this.message=message;

    }

}
