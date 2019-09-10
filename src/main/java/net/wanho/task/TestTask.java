package net.wanho.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
@Component
public class TestTask {
  //每隔五秒钟执行一次
    @Scheduled(cron = "0/5 * * * * *")
    public void  work(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("执行了任务work  "+df.format(System.currentTimeMillis()));
    }

    //固定时间频率
    @Scheduled(fixedDelay = 1000 * 5)
    public void  work2(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("执行了任务work2  "+df.format(System.currentTimeMillis()));
    }
    //修改之后判断哪里发生了变化

    public void  test(){
        System.out.println("git的使用");
    }
}
