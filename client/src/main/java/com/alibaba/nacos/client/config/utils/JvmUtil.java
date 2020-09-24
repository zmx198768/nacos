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

package com.alibaba.nacos.client.config.utils;

import com.alibaba.nacos.client.utils.LogUtils;
import org.slf4j.Logger;

/**
 * Get jvm config.
 *
 * @author Nacos
 */
/**
 * com.alibaba.nacos.client.config.utils.JvmUtil.java
 * @阅读人 zengmx(8574157@qq.com)
 * @阅读时间  2020/9/24 16:05
 * 获取JVM相关配置，此处主要用来判断是否有多个JVM实例运行
 */
public class JvmUtil {

    /**
     * whether is multi instance.
     *
     * @return whether multi
     */
    public static Boolean isMultiInstance() {
        return isMultiInstance;
    }

    private static Boolean isMultiInstance = false;

    private static final String TRUE = "true";

    private static final Logger LOGGER = LogUtils.logger(JvmUtil.class);

    static {
        String multiDeploy = System.getProperty("isMultiInstance", "false");
        if (TRUE.equals(multiDeploy)) {
            isMultiInstance = true;
        }
        LOGGER.info("isMultiInstance:{}", isMultiInstance);
    }
}
