package com.star.design.threadpool;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadPoolExecutor;

@Component
public class MyThreadPoll {

    @Bean
    public ThreadPoolTaskExecutor getThreadPool1(){
        ThreadPoolTaskExecutor threadPoolExecutor = new ThreadPoolTaskExecutor();
        threadPoolExecutor.setCorePoolSize(10);
        threadPoolExecutor.setMaxPoolSize(20);
        threadPoolExecutor.setQueueCapacity(1000);
        threadPoolExecutor.setKeepAliveSeconds(300);
        threadPoolExecutor.setWaitForTasksToCompleteOnShutdown(true);
        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        return threadPoolExecutor;
    }

    @Bean
    public ThreadPoolTaskExecutor getThreadPool2(){
        ThreadPoolTaskExecutor threadPoolExecutor = new ThreadPoolTaskExecutor();
        threadPoolExecutor.setCorePoolSize(10);
        threadPoolExecutor.setMaxPoolSize(20);
        threadPoolExecutor.setQueueCapacity(1000);
        threadPoolExecutor.setKeepAliveSeconds(300);
        threadPoolExecutor.setWaitForTasksToCompleteOnShutdown(true);
        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        return threadPoolExecutor;
    }

}

/*
<!-- rmq发送消息线程池（异步） -->
<bean id="rmqProducerTaskExecutor"
class="org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor">
<!-- 核心线程数 -->
<property name="corePoolSize" value="${threadPool.rmqProducerTaskExecutor.corePoolSize:10}"/>
<!-- 最大线程数 -->
<property name="maxPoolSize" value="${threadPool.rmqProducerTaskExecutor.maxPoolSize:20}"/>
<!-- 队列最大长度 -->
<property name="queueCapacity" value="${threadPool.rmqProducerTaskExecutor.queueCapacity:1000}"/>
<!-- 线程池维护线程所允许的空闲时间 -->
<property name="keepAliveSeconds" value="300"/>
<!-- 线程池销毁前，调用shutdown方法，而不是shutdownNow方法 -->
<property name="waitForTasksToCompleteOnShutdown" value="true"/>
<!-- 线程池对拒绝任务(无线程可用)的处理策略 -->
<property name="rejectedExecutionHandler">
<bean class="java.util.concurrent.ThreadPoolExecutor$AbortPolicy"/>
</property>
</bean>*/
