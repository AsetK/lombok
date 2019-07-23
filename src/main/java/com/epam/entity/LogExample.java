package com.epam.entity;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@Log4j
public class LogExample {

    public void someMethod(){
        log.info("Logging...");
    }
}
