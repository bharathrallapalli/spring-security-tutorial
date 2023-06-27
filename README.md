# spring-security-tutorial
Spring security tutorial with JWT and MYSQL

Add roles to MYSQL DB before starting the application

```roomsql
INSERT INTO secdb.roles (id, name) VALUES(1, 'ROLE_ADMIN');
INSERT INTO secdb.roles (id, name) VALUES(2, 'ROLE_USER');
INSERT INTO secdb.roles (id, name) VALUES(3, 'ROLE_MODERATOR');

```
