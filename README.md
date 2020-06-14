# 收集、统计、分析基金数据

#### 介绍
收集、统计、分析基金数据

#### 使用说明

#开发 development
mvn clean package -Dmaven.test.skip=true -P dev

#测试 test
mvn clean package -Dmaven.test.skip=true -P test

#生产 production
mvn clean package -Dmaven.test.skip=true -P prod

#单独编译某一个module 依赖的module也会编译
mvn clean package -Dmaven.test.skip=true -P test -pl xxx -am