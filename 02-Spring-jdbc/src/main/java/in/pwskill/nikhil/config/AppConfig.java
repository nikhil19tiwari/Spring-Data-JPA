package in.pwskill.nikhil.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "in.pwskill.nikhil")
@Import(Percistence.class)
public class AppConfig {

}
