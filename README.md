# Spring-4.2-Example

A small example project made using the Spring Framework that shows how to configure projects using only annotations.

## Usage
### Requirements
* [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

### How to run
1. Clone this repo.
2. In the project's root directory, run `mvnw clean install`. Windows users will have to use `mvnw.cmd clean install`. This will create a WAR file in the `target` directory.
3. Run `java -jar target/demo-0.0.1-SNAPSHOT.war`. The WAR file contains an embedded web server that will start up on port 8080.

## Things to know
By default, Spring will statically serve anything in the `src/main/resources/static`. Also, files in the `src/main/webapp` directory are also statically served. In this example, assets are placed in the `src/main/webapp` folder. Anything in the `src/main/webapp/WEB-INF` directory is not served statically. This is where `.jsp` files will be stored.

Creating web pages with JSP requires a few dependencies to be added in the `pom.xml` file. Each of the dependencies that were added are marked with comments. Some properties needed to be added to `src/main/resources/application.properties` show Spring where to look for `.jsp` files.  

## Credits
* [Spring Boot](http://projects.spring.io/spring-boot/)
