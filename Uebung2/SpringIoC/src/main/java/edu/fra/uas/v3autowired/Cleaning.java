package edu.fra.uas.v3autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
@Qualifier("pleaseClean")
public class Cleaning implements Work {

    private static final Logger LOGGER = LoggerFactory.getLogger(Painting.class);

    

    public void doWork() {
        LOGGER.info(" --> bring the trash out");
    }


}
