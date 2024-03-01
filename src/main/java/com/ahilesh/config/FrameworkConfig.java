package com.ahilesh.config;

import org.aeonbits.owner.Config;

@Config.Sources("file:F:/Ahilesh/SeleniumAhilesh/SeleniumFramework/src/test/resources/config/FrameworkConfig.properties")

//@Config.Sources(value="file:${user.dir}/src/test/resources/config/FrameworkConfig.properties")

//@Config.Sources(value = "classpath:com/ahilesh/config.properties")
public interface FrameworkConfig extends Config {
    long timeout();

    String url();
    String browser();

    String runmode();

    String remoteURL();
}
