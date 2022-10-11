## Spring-Boot application with Liquibase

### How to run?
clone the codebase
```bash
git clone git@github.com:knoldus/SpringBoot-With-Liquibase-Example.git
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


 
