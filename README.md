# Spring-4.2-Example

A small example project made using the Spring Framework that shows how to configure projects using only annotations.

## Usage
### Requirements
* [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

## Before starting
In the pom.xml, some dependencies were added to allow Spring to interact with Databases. In the `application.properties` file (under `src/main/resources`), some entries were added to allow Spring to connect to a Postgresql database. These are required for Maven to complete its tests even though we connect to a database programmatically. To be able to start the server, you must edit the url, username, and password fields in the `applications.properties` and `DataSourceConfig.java` (in `src/main/java/com/example/utils`) to be able to connect. Run the commands in `dbInit.sql` on your Postgresql database before you start the server (either through `psql` shell, `pgAdmin3`, or whatever client you prefer to use).

### How to run
1. Clone this repo.
2. Start up your Postgresql Database.
3. In the project's root directory, run `mvnw clean install`. Windows users will have to use `mvnw.cmd clean install`. This will create a WAR file in the `target` directory.
3. Run `java -jar target/demo-0.0.1-SNAPSHOT.war`. The WAR file contains an embedded web server that will start up on port 8080. You can access the web page at `http://localhost:8080`.

## Credits
* [Spring Boot](http://projects.spring.io/spring-boot/)
