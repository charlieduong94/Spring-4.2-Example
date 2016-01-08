# Spring-4.2-Example

A small example project made using the Spring Framework that shows how to configure projects using only annotations.

## Usage
### Requirements
* [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

### How to run
1. Clone this repo.
2. In the project's root directory, run `mvnw clean install`. Windows users may have to use the `mvnw.cmd` file (I haven't tested it yet). This will create a JAR file in the `target` directory.
3. Run `java -jar target/demo-0.0.1-SNAPSHOT.jar`. The jar contains an embedded web server that will start up on port 8080.

## Credits
* [Spring Boot](http://projects.spring.io/spring-boot/)
