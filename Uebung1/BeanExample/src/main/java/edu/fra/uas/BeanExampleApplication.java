package edu.fra.uas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;
import org.slf4j.Logger; //1.8 aufgabe
import org.slf4j.LoggerFactory; //1.8 aufgabe

@SpringBootApplication
public class BeanExampleApplication {

	//1.8 logger obj erstellen für diese Klasse hier
	//private static final Logger log =LoggerFactory.getLogger(BeanExampleApplication.class);


	@Autowired
    private MessageService messageService; 
	//1.8 bean(obj) typ beanController  von container bekommen und insanzieren   
	private BeanController beanController;



	public static void main(String[] args) {
		SpringApplication.run(BeanExampleApplication.class, args);
	}
    /* 
	@Bean
	CommandLineRunner init() {
		CommandLineRunner action = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Hello World!");
			}
		};
		return action;
	}*/
    //Erweiterung durch aufgabe1.7
	/* 
		@Bean
	CommandLineRunner init() {
		CommandLineRunner action = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				messageService.setMessage("Hello World");
				System.out.println(messageService.getMessage());
				messageService.setMessage("--> HHHOHHH <--	");
				System.out.println(messageService.getMessage());
				}
			};
			return action;
	} 
	// Aufgabe 1.8 logger 

	/* 
	@Bean
CommandLineRunner init() {
		CommandLineRunner action = new CommandLineRunner() {
		@Override
			public void run(String... args) throws Exception {
				log.debug(beanController.putMessage("Hallo Welt"));
				log.debug(beanController.putMessage("--> OOOHOOO <--"));}

					};
		return action;
	}*/

	//1.8 ende 

			@Bean
	CommandLineRunner init() {
		CommandLineRunner action = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
			
				messageService.setMessage("Hello World");
				messageService.getMessage();

				messageService.setMessage("--> HHHOHHH <--	");
				messageService.getMessage();
				
				}
			};
			return action;
	} 



}

