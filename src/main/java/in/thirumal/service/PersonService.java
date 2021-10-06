package in.thirumal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.thirumal.node.Person;
import in.thirumal.repositorry.PersonRepository;
import reactor.core.publisher.Flux;

/**
 * 
 * @author Thirumal
 *
 */
@Service
public class PersonService {
	
	
	@Autowired
    private PersonRepository repository;
    
  

	@Transactional
    public Flux<Person> doWork() {

        Person emil = new Person("Emil");
        Person gerrit = new Person("Gerrit");
        Person michael = new Person("Michael");

        // Persist entities and relationships to graph database
        return repository.saveAll(Flux.just(emil, gerrit, michael));
    }
}
