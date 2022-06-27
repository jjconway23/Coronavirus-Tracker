package io.JacobsCoronavirusTracker.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirutTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirutTrackerApplication.class, args);
	}

}
