package in.pwskill.nikhil.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class Percistence {
	
	@Bean
	public DataSource dataSource() {
		String location = "D:\\New folder\\Springboot-projects\\01-Spring-jdbc\\src\\main\\java\\application.properties";
	  HikariDataSource hikaridatasource = new HikariDataSource(new HikariConfig(location));
	  return hikaridatasource;
	}
	@Bean
	public JdbcTemplate templete(@Autowired DataSource datasource) {
		return new JdbcTemplate(datasource);
	}
}
