/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.api;

import com.alibaba.nacos.api.config.ConfigFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingFactory;
import com.alibaba.nacos.api.naming.NamingMaintainFactory;
import com.alibaba.nacos.api.naming.NamingMaintainService;
import com.alibaba.nacos.api.naming.NamingService;

import java.util.Properties;

/**
 * Nacos Factory.
 *
 * @author Nacos
 */
/**
 * com.alibaba.nacos.api.NacosFactory.java
 * @阅读人 zengmx(8574157@qq.com)
 * @阅读时间  2020/9/21 15:08
 * nacosFactory使用静态方法生成configService、namingService、namingMaintainService，
 * 三者生成方式方法类似，均为两类入口，分别为传入properties或传入serverAddr进行服务生成
 */
public class NacosFactory {

    /**
     * Create config service.
     *
     * @param properties init param
     * @return config
     * @throws NacosException Exception
     */
    public static ConfigService createConfigService(Properties properties) throws NacosException {
        return ConfigFactory.createConfigService(properties);
    }

    /**
     * Create config service.
     *
     * @param serverAddr server list
     * @return config
     * @throws NacosException Exception
     */
    public static ConfigService createConfigService(String serverAddr) throws NacosException {
        return ConfigFactory.createConfigService(serverAddr);
    }

    /**
     * Create naming service.
     *
     * @param serverAddr server list
     * @return Naming
     * @throws NacosException Exception
     */
    public static NamingService createNamingService(String serverAddr) throws NacosException {
        return NamingFactory.createNamingService(serverAddr);
    }

    /**
     * Create naming service.
     *
     * @param properties init param
     * @return Naming
     * @throws NacosException Exception
     */
    public static NamingService createNamingService(Properties properties) throws NacosException {
        return NamingFactory.createNamingService(properties);
    }

    /**
     * Create maintain service.
     *
     * @param serverAddr server address
     * @return NamingMaintainService
     * @throws NacosException Exception
     */
    public static NamingMaintainService createMaintainService(String serverAddr) throws NacosException {
        return NamingMaintainFactory.createMaintainService(serverAddr);
    }

    /**
     * Create maintain service.
     *
     * @param properties server address
     * @return NamingMaintainService
     * @throws NacosException Exception
     */
    public static NamingMaintainService createMaintainService(Properties properties) throws NacosException {
        return NamingMaintainFactory.createMaintainService(properties);
    }
}
