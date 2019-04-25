package com.example.gradleintellij;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <br><br>
 * Created 2019-04-25 13:59
 *
 * @author Gary Clayburg
 */
@Document
public class Person {

    @SuppressWarnings("UnusedDeclaration")
    private static final Logger log = LoggerFactory.getLogger(Person.class);

    private String name;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
}
