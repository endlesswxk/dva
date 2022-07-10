
package com.scheduletest;

import com.csvprocess.CsvReaderProcess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class ScheduleCronJob {
    private static final Logger log = LoggerFactory.getLogger(ScheduleCronJob.class);
    private static int count;

    /**
     * 每5秒执行一次
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void cron() {
        log.info(Thread.currentThread().getName()+"===task run");
        String filePath = "E:\\重要\\data\\top_weibo_hot_news_20220606_210000.csv";
        CsvReaderProcess.readCsvByBufferedReader(filePath);
        log.info(Thread.currentThread().getName()+"===task end", count++);
    }
}