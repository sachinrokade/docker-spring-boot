# Maven Plugin for Build Docker image

add below plugin in pom.xml
mvn package will use build docker image

```
    <plugin>
	<groupId>com.spotify</groupId>
	<artifactId>dockerfile-maven-plugin</artifactId>
	<version>1.4.10</version>
	<executions>
		<execution>
			<id>default</id>
			<goals>
				<goal>build</goal>
			   <!-- <goal>push</goal> -->
			</goals>
		</execution>
	</executions>
	<configuration>
		<repository>sachinrokade/mvc</repository>
		<!-- <contextDirectory>src/main/docker</contextDirectory> -->
		<tag>${project.artifactId}</tag>
	</configuration>
    </plugin>
```

# Build Docker images
mvn install or mvn package
docker images //listing docker images </br> docker run -p 8091:8091 mvc-simple-docker:0.0.1-SNAPSHOT



# Run with docker images
docker pull sachinrokade/mvc:letest</br>docker run -p 8091:8091 sachinrokade/mvc:letest
