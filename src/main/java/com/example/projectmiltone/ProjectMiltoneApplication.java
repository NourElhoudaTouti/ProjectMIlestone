package com.example.projectmiltone;

import com.example.projectmiltone.Data.Entities.User;
import com.example.projectmiltone.Security.UserAuditor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;


@SpringBootApplication

public class ProjectMiltoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectMiltoneApplication.class, args);
    }
    @Bean
    AuditorAware<User> auditorProvider() {
        return new UserAuditor();
    }


}
