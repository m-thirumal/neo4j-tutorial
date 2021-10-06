/**
 * 
 */
package in.thirumal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.thirumal.node.Person;
import in.thirumal.service.PersonService;
import reactor.core.publisher.Flux;

/**
 * @author Thirumal
 *
 */
@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("")
	public Flux<Person> listPerson() {
		var a =  personService.doWork();
		System.out.println("Done");
		return a;
		
	}

}
