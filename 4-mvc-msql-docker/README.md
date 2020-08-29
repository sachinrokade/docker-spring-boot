docker pull mysql
docker network create demo-mysql-network

docker run --name mysql-boot --network demo-mysql-network -e MYSQL_ROOT_PASSWORD=boot -e MYSQL_DATABASE=mvcdocker -e MYSQL_USER=boot -e MYSQL_PASSWORD=boot -d mysql

mvn package or mvn install [for mvc-msql-docker image]

$ docker images
REPOSITORY TAG IMAGE ID CREATED SIZE
sachinrokade/mvc mvc-msql-docker 956e8af43e1c 4 seconds ago 146MB
mysql latest 0d64f46acfd1 3 weeks ago 544MB
openjdk 8-jdk-alpine a3562aa0b991 15 months ago 105MB

docker run -p 8091:8091 --network demo-mysql-network sachinrokade/mvc:mvc-msql-docker

sql shell in container
$ docker ps
CONTAINER ID IMAGE COMMAND CREATED STATUS PORTS NAMES
09fafaa5d489 sachinrokade/mvc:mvc-msql-docker “java -jar /app.jar” 19 minutes ago Up 19 minutes 0.0.0.0:8091->8091/tcp loving_bhabha
d166926a9d84 mysql “docker-entrypoint.s…” 44 minutes ago Up 44 minutes 3306/tcp, 33060/tcp mysql-boot

Sachin Rokade@DESKTOP-Sachin MINGW64 /c/Program Files/Docker Toolbox
$ docker exec -it d1 bash
root@d166926a9d84:/# mysql -u root -p
Enter password:
Welcome to the MySQL monitor. Commands end with ; or \g.
Your MySQL connection id is 25
Server version: 8.0.21 MySQL Community Server - GPL

Copyright © 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type ‘help;’ or ‘\h’ for help. Type ‘\c’ to clear the current input statement.

mysql> show databases;
±-------------------+
| Database |
±-------------------+
| information_schema |
| mvcdocker |
| mysql |
| performance_schema |
| sys |
±-------------------+
5 rows in set (0.01 sec)

mysql> use mvcdocker;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> select * from student;
±------------±---------±-----------±-----------±--------±--------------------------±-------±---------±---------±-------------+
| roll_number | city | contact | dob | divison | email | gender | standard | pin_code | student_name |
±------------±---------±-----------±-----------±--------±--------------------------±-------±---------±---------±-------------+
| 101 | Amravati | 9632587410 | 9090-04-24 | A | mr.sachinrokade@gmail.com | Male | 1 | 444806 | Sachin |
±------------±---------±-----------±-----------±--------±--------------------------±-------±---------±---------±-------------+
1 row in set (0.00 sec)


#Trublshoot <br>
java.sql.SQLNonTransientConnectionException: Public Key Retrieval is not allowed
solu= spring.datasource.url=jdbc:mysql://mysql-boot/mvcdocker?allowPublicKeyRetrieval=true&useSSL=false

ERROR 1396 (HY000) at line 1: Operation CREATE USER failed for ‘root’@’%’
cuse–> MYSQL_USER=root root allready exit
solu–> MYSQL_USER=other_then_root
