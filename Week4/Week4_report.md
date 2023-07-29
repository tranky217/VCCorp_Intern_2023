# Week 4 Report

## Install MySQL on Ubuntu
MySQL basically has 2 components, one is MySQL server to manage the client connections, process queries from client, receive data from disk. <br>
The second one is MySQL client, it is a command line tool allows user to interact with server.<br>
It's a text-based interface (mysql).<br>
MySQL Workbench: it is a graphical user interface tool that allow user to interact with database more friendly.<br>
It can visualize your data on table, allows user to edit directly on the table ...<br>

## Bad query statements
### Using 'SELECT *'
Using "SELECT *" could return large number of results, make the returned data much more heavier while you could only need one or two data field instead of all. <br>
Eg: SELECT * FROM Users; <br>
-> SELECT FirstName, LastName, Email FROM Users; <br>
### Too many Join
Operate too many join may crash the performance of your machine.<br>
### Avoid using OR 
Taking OR operation on multiple cols is very expensive operation.<br>
-> Break down the queries into each condition and combine them by Union.<br>
SELECT DISTINCT
PRODUCT.ProductID,
PRODUCT.Name
FROM Production.Product PRODUCT
INNER JOIN Sales.SalesOrderDetail DETAIL
ON PRODUCT.ProductID = DETAIL.ProductID
OR PRODUCT.rowguid = DETAIL.rowguid; <br>
-> SELECT
PRODUCT.ProductID,
PRODUCT.Name
FROM Production.Product PRODUCT
INNER JOIN Sales.SalesOrderDetail DETAIL
ON PRODUCT.ProductID = DETAIL.ProductID
UNION
SELECT
PRODUCT.ProductID,
PRODUCT.Name
FROM Production.Product PRODUCT
INNER JOIN Sales.SalesOrderDetail DETAIL
ON PRODUCT.rowguid = DETAIL.rowguid <br>
### Not Using Index
Use index for faster retrieval.<br>

### Avoid using Distinct
SELECT DISTINCT FirstName, LastName, State
FROM Customers <br>
-> SELECT FirstName, LastName, Address, City, State, Zip
FROM Customers <br>
Adding moore field to make it distinct itself.
## SQL and NoSQL databases
### SQL Database
In an RDBMS, data is stored in a structured manner, and
relationships between different data elements are established
using keys. The most common key used for establishing 
relationships is the primary key, which uniquely identifies 
each record in a table. In addition to primary keys, RDBMS 
also supports foreign keys, which establish relationships 
between records in different tables.<br>
#### MySQL
MySQL is an open-source relational database management system
(RDBMS) that is widely used for various applications and 
projects. It is developed and maintained by Oracle Corporation. MySQL uses a client-server architecture, where clients (applications or users) communicate with the MySQL server to manage and retrieve data stored in databases.<br>

#### SQL Server
SQL Server is a relational database management system (RDBMS) 
developed and maintained by Microsoft. It is part of the
Microsoft SQL Server family, which includes different editions
catering to various user needs, from small businesses to large
enterprises. SQL Server is widely used for data storage, 
retrieval, and management in a variety of applications and 
industries.<br>
#### Postgresql
SQL Server is a relational database management system (RDBMS)
developed and maintained by Microsoft. It is part of the
Microsoft SQL Server family, which includes different 
editions catering to various user needs, from small 
businesses to large enterprises. SQL Server is widely
used for data storage, retrieval, and management in a 
variety of applications and industries.<br>
Postgresql supports more data type than the others, like array, JSON, ...<br>
### NoSQl Database
In an RDBMS, data is stored in a structured manner,
and relationships between different data elements are 
established using keys. The most common key used for
establishing relationships is the primary key, which
uniquely identifies each record in a table. In addition
to primary keys, RDBMS also supports foreign keys, which 
establish relationships between records in different tables.<br>

#### MongoDB
Document base<br>
MongoDB is a document database which is often referred to as a non-relational database. This does not mean that relational data cannot be stored in document databases. It means that relational data is stored differently. A better way to refer to it is as a non-tabular database.

MongoDB stores data in flexible documents. Instead of having multiple tables you can simply keep all of your related data together. This makes reading your data very fast.

You can still have multiple groups of data too. In MongoDB, instead of tables these are called collections.

#### Cassandra
Wide Column <br>
Cassandra is designed to handle Big Data. Cassandra’s main feature is to store data on multiple nodes with no single point of failure.

The reason for this kind of Cassandra’s architecture was that the hardware failure can occur at any time. Any node can be down. In case of failure data stored in another node can be used. Hence, Cassandra is designed with its distributed architecture.<br>
#### Neo4J
Graph base<br>
Nowadays, most of the data exists in the form of the relationship between different objects and more often, the relationship between the data is more valuable than the data itself.

Relational databases store highly structured data which have several records storing the same type of data so they can be used to store structured data and, they do not store the relationships between the data.

Unlike other databases, graph databases store relationships and connections as first-class entities.<br>


