package com.github.jslblar080.database_schema_migration;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaselineOnMigrateConfig {

    @Bean
    public FlywayMigrationStrategy flywayMigrationStrategy() {

        return flyway -> {
            flyway.baseline();
            flyway.migrate();
        };
    }
}
