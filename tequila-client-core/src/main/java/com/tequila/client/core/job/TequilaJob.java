package com.tequila.client.core.job;

/**
 * Created by fe on 16/9/1.
 * 任务抽象定义
 */
public interface TequilaJob {

    public void execute(TequilaJobContext tequilaJobContext) throws Exception;
}
