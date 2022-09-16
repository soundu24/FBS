package security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecurityMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityMicroApplication.class, args);
	}

}
