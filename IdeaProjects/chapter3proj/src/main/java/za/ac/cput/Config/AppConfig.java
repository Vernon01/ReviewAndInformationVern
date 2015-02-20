package za.ac.cput.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Person;
import za.ac.cput.implement.Personimp;

/**
 * Created by student on 2015/02/19.
 */
@Configuration
public class AppConfig {
    @Bean(name="personApp")
    public Person getPerson()
    {
        return new Personimp();
    }
}
