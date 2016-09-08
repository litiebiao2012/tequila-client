package com.tequila.client.core.registry;

import com.tequila.client.core.URL;

/**
 * Created by fe on 16/9/1.
 */
public interface RegistryService {

    /**
     * 注册job任务
     * @param url
     */
    void register(URL url);

    /**
     * 卸载job任务
     * @param url
     */
    void unRegister(URL url);


    void available(URL url);
}
