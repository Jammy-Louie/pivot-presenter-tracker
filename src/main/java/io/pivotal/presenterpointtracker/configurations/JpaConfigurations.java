package io.pivotal.presenterpointtracker.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "io.pivotal.presenterpointtracker.repositories.jpa")
public class JpaConfigurations {
}
