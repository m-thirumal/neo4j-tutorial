/**
 * 
 */
package in.thirumal.node;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Thirumal
 *
 */
@Node
@Getter@Setter
public class Person {
	
	@Id
	private Long id;
	private String name;

	public Person(String name) {
		this.name = name;
	}
}
