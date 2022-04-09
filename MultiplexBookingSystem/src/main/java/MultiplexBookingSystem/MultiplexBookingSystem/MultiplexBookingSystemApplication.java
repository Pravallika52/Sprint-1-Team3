package MultiplexBookingSystem.MultiplexBookingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.controller","com.model","com.exception"})
@EnableJpaRepositories({"com.model"})
@EntityScan("com.model")
public class MultiplexBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplexBookingSystemApplication.class, args);
	}

}
