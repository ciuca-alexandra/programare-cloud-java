package com.unitbv.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.unitbv.beans"} )
public class HumanAppCfg {
    @Bean
    Book book()
    {
        return new Book("Dummy title");
    }

    @Bean
    Person person(Book book) {

        return new Person(book);
    }
}
