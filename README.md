## Spring-Boot application with Liquibase [![Build Status](https://travis-ci.org/hhimanshu/spring-boot-liquibase.svg?branch=master)](https://travis-ci.org/hhimanshu/spring-boot-liquibase)

### How to run?
clone the codebase
```bash
git clone <url>
```

compile, test, package
```bash
mvn clean package
```

run
```bash
mvn spring-boot:run
```

Go to http://localhost:8080/h2-console  
  
* `JDBC URL`: ${dbUrl} 
* `User Name`: ${dbUser}  
* `Password`: ${dbPass}


 