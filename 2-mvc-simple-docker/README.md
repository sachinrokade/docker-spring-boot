# Build Docker images
mvn install or mvn package
docker images //listing docker images
docker run -p 8091:8091 mvc-simple-docker:0.0.1-SNAPSHOT



# Run with docker images
docker pull sachinrokade/mvc:letest
docker run -p 8091:8091 sachinrokade/mvc:letest
