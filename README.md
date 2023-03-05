# MyBatis-Plus demo项目

## 相关原理分析文章
https://www.xudj.top/categories/mybatis-plus

## 执行
1、创建数据库
2、执行下面sql脚本
3、运行项目或执行单测进行测试

## sql脚本
### ddl
CREATE TABLE test.`user` (
`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
`name` varchar(30) DEFAULT NULL COMMENT '姓名',
`age` int DEFAULT NULL COMMENT '年龄',
`email` varchar(50) DEFAULT NULL COMMENT '邮箱',
`deleted` int DEFAULT NULL,
`create_by` datetime DEFAULT NULL COMMENT '创建时间',
`tel_phone` varchar(45) DEFAULT NULL COMMENT '手机号',
PRIMARY KEY (`id`),
KEY `idx_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表'

CREATE TABLE test.`orders` (
`id` tinyint unsigned NOT NULL AUTO_INCREMENT,
`name` varchar(45) DEFAULT NULL COMMENT '订单名称',
`user_id` tinyint unsigned NOT NULL COMMENT '用户id',
`deleted` int DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单'

### dml
INSERT INTO test.`user`(`id`,`name`,`age`,`email`,`deleted`,`create_by`,`tel_phone`) VALUES (1,'Jack',18,'1@126.com',0,NULL,'13512344321');
INSERT INTO test.`orders`(`id`,`name`,`user_id`,`deleted`) VALUES (1,'订单',1,0);
