<!DOCTYPE html>
<html>
  <head>
    <title>Spring!</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/styles.css"/>
  </head>
  <body>
    <div class="content">
      <a href="http://spring.io">
        <img src="images/spring.png">
      </a>
      <br>
      <p>
        The Spring Framework is a Java platform that provides an infrastructure for developing web applications.
      </p>
      <p>
        This project was made to show how a simple service can be made using Spring's annotations.
      </p>
      <p>
        Spring Boot was used to create this project because it handles all of the bootstrapping and removes
        the need for us to use manage the project with XML. The original starter project can be found
        <a href="http://projects.spring.io/spring-boot/">here</a>.
      </p>
      <p>
        Here is a randomly generated quote about Spring Boot retrieved from
        <a href="http://gturnquist-quoters.cfapps.io/api/random">
          http://gturnquist-quoters.cfapps.io/api/random
        </a> (go ahead, refresh the page a few times):
      </p>
      <div class="row">
        <div class="col-md-offset-3 col-md-6" >
          <blockquote>
            <p><em>"${quote}"</em></p>
            <footer>Random Quote #${quoteID} about Spring Boot's ${quoteType}</footer>
          </blockquote>
        </div>
      </div>
      <p>Try going to <a href="http://localhost:8080/date">http://localhost:8080/date</a> and
        <a href="http://localhost:8080/hello/world">http://localhost:8080/hello/world</a>.
        The first URL returns some JSON and the second just returns plain text.
      </p>
      <p>
        You can see how each of these routes are being served by checking out the code in the
        <strong>src</strong> folder.
      </p>
    </div>
  </body>
</html>
