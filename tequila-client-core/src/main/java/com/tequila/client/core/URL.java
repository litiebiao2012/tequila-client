package com.tequila.client.core;

import java.util.Map;

/**
 * Created by fe on 16/9/1.
 * job url描述
 */
public class URL {
    /**
     * 客户端ip
     */
    private String clientIp;
    /**
     * 客户端hostName
     */
    private String clientHostName;
    /**
     * 应用名
     */
    private String applicationName;
    /**
     * 应用描述
     */
    private String applicationDescription;
    /**
     * 负责人
     */
    private String owner;
    /**
     * job实现类
     */
    private String className;
    /**
     * job描述
     */
    private String jobDescription;
    /**
     * cron表达式
     */
    private String cron;
    /**
     * 是否在运行
     */
    private boolean isRunning;
    /**
     * 客户端第一次连接到注册中心时间戳
     */
    private Long timeStamp;
    /**
     * 自定义参数
     */
    private Map<String,String> parameters;
    /**
     * 错误描述, key-时间 , value-错误内容
     */
    private Map<Long,String> errorMsg;
    /**
     * 错误描述, key-时间 , value-一次任务执行消耗时间,单位毫秒
     */
    private Map<Long,String> runUseTimes;

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getClientHostName() {
        return clientHostName;
    }

    public void setClientHostName(String clientHostName) {
        this.clientHostName = clientHostName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationDescription() {
        return applicationDescription;
    }

    public void setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public Map<Long, String> getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(Map<Long, String> errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Map<Long, String> getRunUseTimes() {
        return runUseTimes;
    }

    public void setRunUseTimes(Map<Long, String> runUseTimes) {
        this.runUseTimes = runUseTimes;
    }
}
