package com.yes2aamu.yes2aamursvp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.yes2aamu.yes2aamursvp.entity")
@EnableJpaRepositories("com.yes2aamu.yes2aamursvp.repository")
public class Yes2AamuRsvpApplication {
  public static void main(String[] args) {
    SpringApplication.run(Yes2AamuRsvpApplication.class, args);
  }
}
