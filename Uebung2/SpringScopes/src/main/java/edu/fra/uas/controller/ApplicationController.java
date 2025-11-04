package edu.fra.uas.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.fra.uas.session.Session;

@Controller
public class ApplicationController {

	private static final Logger log = LoggerFactory.getLogger(ApplicationController.class);
	
	@Autowired
	ApplicationContext applicationContext;
	
	public ApplicationController() {}
	
	@RequestMapping(value = "/path1")
	public String showPage1() {
		Session session1 = (Session) applicationContext.getBean(Session.class);
		Session session2 = (Session) applicationContext.getBean(Session.class);
		log.info(session1.getSessionName());
		log.info(session2.getSessionName());
		return "page";
	}
	// 2 mal die selbe methode oben und unter je nach dem welche url genutz wird ,wird die methode aufgerufne idf nur path2 also unten die M
	@RequestMapping(value = "/path2")
	public String showPage2() {
		Session session1 = (Session) applicationContext.getBean(Session.class); // Controller forder bean an
		Session session2 = (Session) applicationContext.getBean(Session.class);// hier auch wieder um zu sehen wie scope  	
		log.info(session1.getSessionName());                                                //anzahl verändert die durch getBean geforder wird 
		log.info(session2.getSessionName());
		return "page";
	}
    //ALLE BINDUNGSBEREICHE SCOPES 
	// Singelton SCOPE: alle nutzen nur 1 Bean der einmalig beim ersten getbean erzeugt wird
	// protoype SCOPE: jeder getbean aufruf erstellt ein bean 
	// Request SCOPE: jeder http request erstellt ein bean der für alle aktionen dieses Request dienen bsp seite laden 
	// spring schaut ob eine bean existiert wenn nicht 
	// session1 get bean wird  erstellt  , bei session 2 schaut spring gibt es eine bean für diesen request idf ja  und weißt dann zu 

	// Session SCOPE: Eine Bean pro Benutzersitzung (HTTP-Session).
    //               Alle Requests aus derselben Browser-Session teilen sich dieselbe Bean.
    //               Erst wenn eine neue Session beginnt (z. B. anderer Browser oder Browser neu gestartet),
    //               wird eine neue Bean erzeugt.

	
}
