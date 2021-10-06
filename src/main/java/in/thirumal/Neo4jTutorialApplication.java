package in.thirumal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableReactiveNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableReactiveNeo4jRepositories
@SpringBootApplication
public class Neo4jTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jTutorialApplication.class, args);
	}

}
