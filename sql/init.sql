create database `fundData` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
CREATE TABLE `sys_task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '任务名称',
  `task_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '任务代码',
  `is_finish` int(1) DEFAULT NULL COMMENT '是否完成 0:初始化 1:进行中 2:已完成',
  `retry_count` int(4) DEFAULT NULL COMMENT '重试次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
CREATE TABLE `fund_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '公司名称',
  `company_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '公司代码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
CREATE TABLE `fund_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fund_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '基金代码',
  `fund_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '基金名称',
  `fund_name_abbreviation` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '基金拼音缩写',
  `fund_name_pinyin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '基金拼音名',
  `Investment_target_type` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '投资标的类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
CREATE TABLE `fund_real_time_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fund_code` varchar(10) DEFAULT NULL COMMENT '基金代码',
  `fund_name` varchar(255) DEFAULT NULL COMMENT '基金名称',
  `jzrq` datetime DEFAULT NULL COMMENT '净值日期',
  `dwjz` varchar(255) DEFAULT NULL COMMENT '单位净值',
  `gsz` varchar(255) DEFAULT NULL COMMENT '估算值',
  `gszzl` varchar(255) DEFAULT NULL,
  `gztime` datetime DEFAULT NULL COMMENT '估值时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

alter table sys_task add column `task_start_time` datetime default null comment '任务开始时间';
alter table sys_task add column `task_end_time` datetime default null comment '任务结束时间';
CREATE TABLE `fund_suspend` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fund_code` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '基金代码',
  `fund_name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '基金名称',
  `suspend_date` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '暂停赎回日期',
  `open_date` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '开放赎回日期',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `batch_num` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '批次号',
  `suspend_type` int DEFAULT NULL COMMENT '暂停类型 1:暂停申购 2:暂停赎回',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;