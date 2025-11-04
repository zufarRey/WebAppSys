package edu.fra.uas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThirdService {

    @Autowired
	private CounterService counterService;
    

    public void counting(){
		counterService.count();
		
	}

}
