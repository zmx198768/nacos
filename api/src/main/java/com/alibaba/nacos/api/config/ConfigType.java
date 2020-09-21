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

package com.alibaba.nacos.api.config;

/**
 * Config data type.
 *
 * @author liaochuntao
 **/
/**
 * com.alibaba.nacos.api.config.ConfigType.java
 * @阅读人 zengmx(8574157@qq.com)
 * @阅读时间  2020/9/21 18:08
 * 配置类型支持，目前支持properties、xml、json、text、html、yaml，支持在界面配置
 */
public enum ConfigType {

    /**
     * config type is "properties".
     */
    PROPERTIES("properties"),

    /**
     * config type is "xml".
     */
    XML("xml"),

    /**
     * config type is "json".
     */
    JSON("json"),

    /**
     * config type is "text".
     */
    TEXT("text"),

    /**
     * config type is "html".
     */
    HTML("html"),

    /**
     * config type is "yaml".
     */
    YAML("yaml");

    String type;

    ConfigType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
