## MySql

* Command for creating InterConnection between your localhost and MySql:
 > mysql -u root -p -h 127.0.0.1
 
* If you kept some username and password for MySql:
 > mysql -u username -p password -h 127.0.01
 
* Checking database is connected or not:
 > show databases;
 
* Creating new database:
 > create database name;
 
* Start Using it:
 > use name;
 
* Creating table:
 > Create table name(Coloumn1 datatype, Coloumn2 datatype, .....)

* Inserting into table:
 > insert into name values('value1', value2, .....)
 
* Note: String will be stored inside single quotes

* Checking the database:
 > select * from name;
 
* Sorting the table:
 > select * from table order by coloumn_name;

* Sorting the table in decreasing order:
 > select * from table order by coloumn_name desc;

* Sorting according to our preference:
 > select * from table order by (coloumn, 'value1', 'value2' , 'value3')
 
* Delete the table:
 > delete from table where condition;
