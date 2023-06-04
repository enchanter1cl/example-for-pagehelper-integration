# example-for-pagehelper-integration

## Project Introduction 工程简介

Integrate mybatis' paging plugin 'PageHelper' into Spring Boot.

### Technology involved

- Mybatis
  - dynamic sql
  - PageHelper
- Spring Boot
- EasyCode (Code Generator)

### functionality

1 Query All the items, then page them

2 Query some items with uncertain conditions, then page them

(See Domain model in `/sql` directory) 创建表和数据的 sql 语句请见文件夹 `/sql`。

## Extended Reading 延伸阅读

mybatis-dynamic-sql \ Mybatis 的动态 sql 语法介绍:

https://github.com/mybatis/mybatis-dynamic-sql

Mybatis-PageHelper \ Mybatis-PageHelper 插件介绍:

https://github.com/pagehelper/Mybatis-PageHelper

Use EasyCode to generate CRUD code automatically \ CRUD 代码生成工具 EasyCode:

https://blog.csdn.net/Enchanter06/article/details/128880118?spm=1001.2014.3001.5501
