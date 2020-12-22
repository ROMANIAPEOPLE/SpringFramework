package me.kh.springframework.nullSafety;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppSafetyRunner implements ApplicationRunner {
    @Autowired
    EventService eventService;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        eventService.createEvent(null);
    }
}
