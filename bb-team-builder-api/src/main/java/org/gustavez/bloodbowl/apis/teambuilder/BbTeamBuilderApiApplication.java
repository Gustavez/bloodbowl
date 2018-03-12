package org.gustavez.bloodbowl.apis.teambuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class BbTeamBuilderApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbTeamBuilderApiApplication.class, args);
	}
}
