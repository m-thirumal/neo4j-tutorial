package in.thirumal.repositorry;

import org.neo4j.driver.internal.shaded.reactor.core.publisher.Flux;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.stereotype.Repository;

import in.thirumal.node.Person;

/**
 * @author Thirumal
 *
 */
@Repository
public interface PersonRepository extends ReactiveNeo4jRepository<Person, Long> {
	
    Flux<Person> findAllByName(String name);

    Flux<Person> findAllByNameLike(String name);

}
