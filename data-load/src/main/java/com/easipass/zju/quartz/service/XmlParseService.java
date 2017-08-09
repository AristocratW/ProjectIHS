package com.easipass.zju.quartz.service;

import com.easipass.zju.quartz.job.XmlParseJob;
import com.easipass.zju.util.FileUtil;
import org.apache.commons.configuration.ConfigurationException;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ssw on 17-8-3.
 */
public class XmlParseService {
    public void start(){
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler;
        String cron;
        String sourcePath;
        String initTime;

        try {
            scheduler = schedulerFactory.getScheduler();
            cron = FileUtil.getSourceFileInfo().getCron();
            sourcePath = FileUtil.getSourceFileInfo().getSourcePath();
            initTime = FileUtil.getSourceFileInfo().getInitTime();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
            Date date = simpleDateFormat.parse(initTime);
            JobDataMap jobDataMap = new JobDataMap();
            jobDataMap.put("sourcePath",sourcePath);
            JobDetail jobDetail = JobBuilder.newJob(XmlParseJob.class).withIdentity("XmlParseJob","XmlParseGroup").setJobData(jobDataMap).build();
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("XmlParseTrigger","XmlParseGroup").withSchedule(CronScheduleBuilder.cronSchedule(cron)).startAt(date).build();
            scheduler.scheduleJob(jobDetail,trigger);
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        XmlParseService xml = new XmlParseService();
        xml.start();
    }
}
