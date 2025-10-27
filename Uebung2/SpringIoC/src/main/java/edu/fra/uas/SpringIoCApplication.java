package edu.fra.uas;

// v1instantiating
//import edu.fra.uas.v1instantiating.MasterV1;

// v2setter
//import edu.fra.uas.v2setter.Drilling;
//import edu.fra.uas.v2setter.Journeyman;
//import edu.fra.uas.v2setter.MasterV2;

// v3autowired
import edu.fra.uas.v3autowired.MasterV3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringIoCApplication {

    // v1instantiating
    //@Autowired
    //private MasterV1 masterV1;

    // v3autowired
   @Autowired
    private MasterV3 masterV3;

    public static void main(String[] args) {
        SpringApplication.run(SpringIoCApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {
        CommandLineRunner action = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                // v1instantiating
              // masterV1.delegateWork();

                // v2setter
//                MasterV2 masterV2 = new MasterV2();
//                masterV2.setJourneymanAndWork(new Journeyman(), new Drilling()); 
// ablauf  übergeben ein journeyman/azubi obj  und new Drilling obj was Interface  Work implementiert und deswegen akzeptiert wird
//setJourney... methode ist von journeyman das als feld in master exsitiert, gehen in jmann klasse rein und setzt sein Feld WORK m
// also das interface Work mit dem obj new Drilling was uns die konkrete implementierung dann gibt 
// return angabe wird nicht verweretet ist sinnlos da das feld work in journeyman gesetzt wird und journeyman als obj in Master exisitert 
// und diesen wert dann auch gat

//                masterV2.delegateWork();

                // v3autowired
               masterV3.delegateWork();
            }
        };
        return action;
    }

}
