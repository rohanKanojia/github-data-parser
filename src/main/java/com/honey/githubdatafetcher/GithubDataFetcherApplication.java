package com.honey.githubdatafetcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class GithubDataFetcherApplication {
    public static void main(String[] args) {
            SpringApplication.run(GithubDataFetcherApplication.class, args);
    }

    @RequestMapping
    String home() {
        return "<h1>Hello World!</h1>";
    }
}
