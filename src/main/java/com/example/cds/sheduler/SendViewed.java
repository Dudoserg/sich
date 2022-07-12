package com.example.cds.sheduler;

import com.example.cds.service.MainService;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class SendViewed {

    private final MainService mainService;

    public SendViewed(MainService mainService) {
        this.mainService = mainService;
    }


    @Scheduled(fixedDelay = 10000)
    public void scheduleFixedDelayTask()  {
        log.error("error scheduleFixedDelayTask");
        log.info("info  scheduleFixedDelayTask");
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
