package com.example.gradleintellij;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <br><br>
 * Created 2018-02-10 09:45
 *
 * @author Gary Clayburg
 */
@Configuration
@ConfigurationProperties(prefix = "policy")
public class ApplicationSettings {

    private String groovyHome;

    public String getGroovyHome() {
        return groovyHome;
    }

    public ApplicationSettings setGroovyHome(String groovyHome) {
        this.groovyHome = groovyHome;
        return this;
    }
}
