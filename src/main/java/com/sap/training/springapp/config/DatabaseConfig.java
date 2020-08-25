package com.sap.training.springapp.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration /* configuration bean (anything managed by spring framework) */
public class DatabaseConfig {
    @Bean /* Spring will be able to pickup instances of DataSource class from here */
    public DataSource getDataSource() {

        return DataSourceBuilder.create()
                .url("jdbc:sap://zeus.hana.prod.eu-central-1.whitney.dbaas.ondemand.com:23097?encrypt=true&validateCertificate=true&currentschema=9AF6438DE7B746CBBDF5F1021DB122A1AKASHMAINLINENANDI")
                .username("9AF6438DE7B746CBBDF5F1021DB122A1AKASHMAINLINENANDI")
                .password("Ps8r6WHLE1Za0A0adQDQhvQV-iI6Kw39.jN9NIvgwAAgV-SnTaXr-M.SbR8b9FURO9bI92n3_vPalc6_QuBTEjkR3UY62b8dk_R1zyJOU9f53FaT-rI951A3vGq_6pmH")
                .driverClassName("com.sap.db.jdbc.Driver")
                .build();
    }
}
