# CONDUIT
A real-world demo application (clone of Medium.com) made with Spring Boot and written in Kotlin 

## Development 

### Setup 

#### Database 
This uses a postgres database. Setup the database with the following commands

```postgresql
create database spring_conduit;
create user spring_conduit with encrypted password 'spring_conduit';
grant all privileges on database spring_conduit to spring_conduit;
```