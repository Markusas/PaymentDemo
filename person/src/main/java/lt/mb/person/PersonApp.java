package lt.mb.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EnableAutoConfiguration
@SpringBootApplication
@EntityScan("lt.mb.common")
public class PersonApp {
    public static void main(String[] args) {
        SpringApplication.run(PersonApp.class, args);
    }
}
