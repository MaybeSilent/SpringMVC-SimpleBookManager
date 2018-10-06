# 简易图书管理

> mysql 8.0.12		Java 1.8		 Maven 3.56		IDEA 2018.2 	 tomcat 9.0	

> 其余可根据maven进行相应的构建

> 利用maven构建的spring mvc简易项目

- 数据库表的定义

  ```mysql
  //mysql创建相应的表
  mysql -u name -p password
  create database dbcourse;
  use dbcourse;
  create table Book (
  -> id int AUTO_INCREMENT PRIMARY KEY,
  -> name varchar(50) not null,
  -> price int not null,
  -> author varchar(50) not null); 
  insert into book values(null,'数据库系统概论',20,'萨师暄，王珊')
  ```

  ![Alt text](/readmepictrues/database.png)

- 数据库连接方法
  - 通过mysqlDbUtils类采用jdbc进行相应的连接，代码位于bookmana/src/main/java/dao/db
  - 实现数据库的增删改查功能位于bookmana/src/main/java/bookImpl，通过相应的sql语句

- 查询书籍结果展示

- ![Alt text](/readmepictrues/quary.png)

- 增加书籍结果页面展示

- ![Alt text](/readmepictrues/insertbefore.png)

- ![Alt text](/readmepictrues/insertafter.png)

- 更改价格结果页面展示

- ![Alt text](/readmepictrues/changebefore.png)

- ![Alt text](/readmepictrues/changeafter.png)

- 删除书籍结果页面展示

- ![Alt text](/readmepictrues/deletebefore.png)

- ![Alt text](/readmepictrues/deleteafter.png)

- 前端页面来源于[html5UP](https://html5up.net/)