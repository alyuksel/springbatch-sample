# springbatch-sample


## Database

Mysql

driver=com.mysql.jdbc.Driver

url=localhost:3306/devdb

username=dbuser

password=dbmdp

Everything is configured by SpringBoot. No hibernate dependency is needed. Only the destination database type connector is required.
This batch use JdbcTemplate to write records in database.
