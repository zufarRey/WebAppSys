package edu.fra.uas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private final CounterService counterService;
	
	
    


	// Constructor Injection: im ersten Schritt auskommentieren
	//@Autowired
	private SecondService secondService;
	
	// Normales Java Vorgehen Harte koppelung was man nicht in Spring nutzt!
	//public FirstService() {
//		secondService = new SecondService();
	//}
	
	// Constructor Injection
	@Autowired
	public FirstService(SecondService secondService, CounterService counterService) {
		this.secondService = secondService;
		this.counterService = counterService;
	}

	
	// Setter Injection
	//@Autowired
	//public void setSecondService(SecondService secondService) {
	//	this.secondService = secondService;
	//}
	
	public void doSomething() {
		secondService.doSomething();
	}
	public void counting(){
		counterService.count();
		
	}
	
}
