package edu.fra.uas.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CounterService {
    public int count=0;


     private static final Logger log = LoggerFactory.getLogger(CounterService.class);

    public void count(){
        count++;
        log.info("Counter activated for Object, Count: "+count);
        log.info("If count gets higher each time same object is used for all three classes");
    }

}
