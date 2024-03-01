package com.ahilesh.config;

public final class ConfigFactory {

    private ConfigFactory(){};
    public static FrameworkConfig getconfig(){
        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}
