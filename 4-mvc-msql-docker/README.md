
# Commands</br>
docker pull mysql</br>
docker network create demo-mysql-network</br></br>
docker run -name mysql-boot -network demo-mysql-network -e MYSQL_ROOT_PASSWORD=boot -e MYSQL_DATABASE=mvcdocker -e MYSQL_USER=boot -e MYSQL_PASSWORD=boot mysql</br></br>
mvn package or mvn install [for mvc-msql-docker image]</br></br>

$ docker images</br>

| REPOSITORY       | TAG             | IMAGE ID     | CREATED       | SIZE  |
|------------------|-----------------|--------------|---------------|-------|
| sachinrokade/mvc | mvc-msql-docker | 956e8af43e1c | 4 seconds ago | 146MB |
| mysql            | latest          | 0d64f46acfd1 | 3 weeks ago   | 544MB |
| openjdk          | 8-jdk-alpine    | a3562aa0b991 | 15 months ago | 105MB |


</br></br></br>
docker run -p 8091:8091 --network demo-mysql-network  sachinrokade/mvc:mvc-msql-docker</br></br>

# sql shell in container</br></br>

$ docker ps</br>

| CONTAINER ID | IMAGE                            | COMMAND                | CREATED        | STATUS        | PORTS                  | NAMES         |
|--------------|----------------------------------|------------------------|----------------|---------------|------------------------|---------------|
| 09fafaa5d489 | sachinrokade/mvc:mvc-msql-docker | "java -jar /app.jar"   | 19 minutes ago | Up 19 minutes | 0.0.0.0:8091->8091/tcp | loving_bhabha |
| d166926a9d84 | mysql                            | "docker-entrypoint.s…" | 44 minutes ago | Up 44 minutes | 3306/tcp, 33060/tcp    | mysql-boot    |


</br></br>Sachin Rokade@DESKTOP-Sachin MINGW64 /c/Program Files/Docker Toolbox</br>$ docker exec -it d1 bash</br>root@d166926a9d84:/#  mysql -u root -p</br>Enter password:</br>Welcome to the MySQL monitor.  Commands end with ; or \g.</br>Your MySQL connection id is 25</br>Server version: 8.0.21 MySQL Community Server - GPL</br></br>Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.</br></br>Oracle is a registered trademark of Oracle Corporation and/or its</br>affiliates. Other names may be trademarks of their respective</br>owners.</br></br>Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.</br></br>mysql> show databases;</br>+--------------------+</br>| Database           |</br>+--------------------+</br>| information_schema |</br>| mvcdocker          |</br>| mysql              |</br>| performance_schema |</br>| sys                |</br>+--------------------+</br>5 rows in set (0.01 sec)</br></br>mysql> use mvcdocker;</br>Reading table information for completion of table and column names</br>You can turn off this feature to get a quicker startup with -A</br></br>Database changed</br>mysql> select * from student;</br>+-------------+----------+------------+------------+---------+------------------+--------+----------+----------+--------------+</br>| roll_number | city     | contact    | dob        | divison | email            | gender | standard | pin_code | student_name |</br>+-------------+----------+------------+------------+---------+------------------+--------+----------+----------+--------------+</br>|         101 | Amravati | 9632587410 | 9090-04-24 | A       |srokade@gmail.com | Male   |        1 | 444806   | Sachin       |</br>+-------------+----------+------------+------------+---------+------------------+--------+----------+----------+--------------+</br>1 row in set (0.00 sec)</br></br></br></br></br>

# Troubleshoot </br></br>
java.sql.SQLNonTransientConnectionException: Public Key Retrieval is not allowed</br>solu= spring.datasource.url=jdbc:mysql://mysql-boot/mvcdocker?allowPublicKeyRetrieval=true&useSSL=false</br></br></br>ERROR 1396 (HY000) at line 1: Operation CREATE USER failed for 'root'@'%'</br>cuse--> MYSQL_USER=root   root allready exit</br>solu--> MYSQL_USER=other_then_root</br> 
