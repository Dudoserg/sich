package com.example.cds.sheduler;

import com.example.cds.service.MainService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SendViewed {

    private final MainService mainService;

    public SendViewed(MainService mainService) {
        this.mainService = mainService;
    }


    @Scheduled(fixedDelay = 10000)
    public void scheduleFixedDelayTask()  {
        try {
            System.out.println("shedule...");
            mainService.sendViewedToAms();
        } catch (Exception e) {
            //e.printStackTrace();
            // TODO log
            System.out.println("exception");
        }
    }
}
