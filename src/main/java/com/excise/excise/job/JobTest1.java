package com.excise.excise.job;


import com.excise.excise.util.TimeUtil;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@EnableScheduling
public class JobTest1 {

    @Scheduled(cron = "0/5 * * * * *")
    public void task(){
        System.out.println(TimeUtil.date2Str(new Date(),"YYYY-MM-dd HH:mm:ss") + "任务1执行....");
    }


}
