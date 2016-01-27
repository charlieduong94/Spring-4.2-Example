package com.example.utils;

import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
/**
 * This is POJO (Plain Old Java Object) that acts as a simple container for data.
 *
 * The data contained in this object will converted into JSON (JavaScript Object Notation)
 * when sent back from the server.
 * @author charlie
 */
public class DataSourceConfig {
    public static DataSource getDataSource(){
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName("org.postgresql.Driver");
      dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
      dataSource.setUsername("postgres");
      dataSource.setPassword("postgres");
      return dataSource;
    }
}
