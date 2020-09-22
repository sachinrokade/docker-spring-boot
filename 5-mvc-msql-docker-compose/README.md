
# Commands</br>
mvn package </br>
docker-compose up

# sql shell in container</br>
$ docker exec -it d1 bash</br>root@d166926a9d84:/#  mysql -u root -p</br>Enter password:</br>Welcome to the MySQL monitor.  Commands end with ; or \g.</br>Your MySQL connection id is 25</br>Server version: 8.0.21 MySQL Community Server - GPL</br></br>Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.</br></br>Oracle is a registered trademark of Oracle Corporation and/or its</br>affiliates. Other names may be trademarks of their respective</br>owners.</br></br>Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.</br></br>mysql> show databases;</br>
</br>

| Database           |
|--------------------|
| information_schema |
| mvcdocker          |
| mysql              |
| performance_schema |
| sys                |

</br>5 rows in set (0.01 sec)</br></br>mysql> use mvcdocker;</br>Reading table information for completion of table and column names</br>You can turn off this feature to get a quicker startup with -A</br></br>Database changed</br>mysql> select * from student;</br>


| roll_number | city     | contact    | dob        | divison | email              | gender | standard | pin_code | student_name |
|-------------|----------|------------|------------|---------|--------------------|--------|----------|----------|--------------|
| 101         | Amravati | 9632587410 | 9090-04-24 | A       | srokade@gmail.com  | Male   | 1        | 444608   | Sachin       |

</br>1 row in set (0.00 sec)</br></br></br></br></br>
