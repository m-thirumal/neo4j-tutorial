# neo4j-tutorial

Run `Neo4J` in docker
	
	docker run -d --publish=7474:7474 --publish=7687:7687 --volume=$HOME/neo4j/data:/data -e 'NEO4J_AUTH=neo4j/thirumal' neo4j