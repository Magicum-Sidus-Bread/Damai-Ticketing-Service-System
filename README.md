# 项目介绍

大麦订票服务系统提供了可以在线上对相应的节目（包括：演唱会、话剧歌剧、体育比赛、儿童亲子）进行订票的功能，用户可以进行注册，登录，然后选择节目和座位后进行购票，支付，以及查询自己的订单功能

## 项目优势

项目中包括了 **微服务**、**本地缓存/分布式缓存**、**消息队列**、**搜索引擎**、**并发编程**、**本地锁/分布式锁**、**设计模式**、**分库分表** 等核心技术

## 技术结构

- 使用了 **SpringCloud+SpringCloudAlibaba** 的微服务结构

- 使用了 **Nacos** 作为注册中心

- 使用 **Redis** 不仅仅作为缓存，还使用了`Lua脚本`/`延迟队列`/`Stream消息队列` 等高级特性

- 引入了 **Kafka** 消息中间件，**SpringBootAdmin** 作为服务的监控通知

- **ELK** 作为日志的记录，**ElasticSearch**提供搜索和展示功能，

- **Sentinel/Hystrix** 作为熔断保护层

- 使用 **ShardingSphere** 实现分库分表，来存储海量的数据

通过以上设计，来实现应对高并发、高吞吐的能力，以及海量数据的存储和服务状态的监控

![](https://multimedia-javaup.cn/%E6%9E%B6%E6%9E%84%E5%9B%BE/%E9%A1%B9%E7%9B%AE%E6%9E%B6%E6%9E%84%E5%9B%BE%28%E5%8E%8B%E7%BC%A9%E5%90%8E%29.jpg)

## 业务结构

![](https://multimedia-javaup.cn/%E6%9E%B6%E6%9E%84%E5%9B%BE%2F%E9%A1%B9%E7%9B%AE%E4%B8%9A%E5%8A%A1%E7%9A%84%E7%BB%93%E6%9E%84%E5%9B%BE.png)

## 技术选型

| 技术                 | 说明               | 官网                                                         |
| -------------------- | ------------------ | ------------------------------------------------------------ |
| Spring-Boot          | Web服务框架        | [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot) |
| Spring-Cloud         | 微服务框架         | [https://spring.io/projects/spring-cloud](https://spring.io/projects/spring-cloud) |
| Spring-Cloud-alibaba | alibaba微服务框架  | [https://github.com/alibaba/spring-cloud-alibaba](https://github.com/alibaba/spring-cloud-alibaba) |
| Spring-Cloud-Gateway | 微服务网关         | [https://spring.io/projects/spring-cloud-gateway](https://spring.io/projects/spring-cloud-gateway) |
| Nacos                | 服务注册中心       | [https://nacos.io/zh-cn/index.html](https://nacos.io/zh-cn/index.html) |
| Sentinel             | 服务熔断           | [https://sentinelguard.io/zh-cn/](https://sentinelguard.io/zh-cn/) |
| Log4j2               | 日志框架           | [https://github.com/apache/logging-log4j2](https://github.com/apache/logging-log4j2) |
| Mysql                | 数据库             | [https://www.mysql.com/](https://www.mysql.com/)             |
| MyBatis-Plus         | ORM框架            | [https://baomidou.com](https://baomidou.com)                 |
| MyBatisGenerator     | 数据层代码生成器   | [http://www.mybatis.org/generator/index.html](http://www.mybatis.org/generator/index.html) |
| AJ-Captcha           | 图形验证码         | [https://gitee.com/anji-plus/captcha](https://gitee.com/anji-plus/captcha) |
| Kafka                | 消息队列           | [https://github.com/apache/kafka/](https://github.com/apache/kafka/) |
| Redis                | 分布式缓存         | [https://redis.io/](https://redis.io/)                       |
| Redisson             | 分布式Redis工具    | [https://redisson.org](https://redisson.org)                 |
| Elasticsearch        | 搜索引擎           | [https://github.com/elastic/elasticsearch](https://github.com/elastic/elasticsearch) |
| LogStash             | 日志收集工具       | [https://github.com/elastic/logstash](https://github.com/elastic/logstash) |
| Kibana               | 日志可视化查看工具 | [https://github.com/elastic/kibana](https://github.com/elastic/kibana) |
| Nginx                | 静态资源服务器     | [https://www.nginx.com/](https://www.nginx.com/)             |
| Docker               | 应用容器引擎       | [https://www.docker.com](https://www.docker.com)             |
| Jenkins              | 自动化部署工具     | [https://github.com/jenkinsci/jenkins](https://github.com/jenkinsci/jenkins) |
| Hikari               | 数据库连接池       | [https://github.com/brettwooldridge/HikariCP](https://github.com/brettwooldridge/HikariCP) |
| JWT                  | JWT登录支持        | [https://github.com/jwtk/jjwt](https://github.com/jwtk/jjwt) |
| Lombok               | Java语言增强插件   | [https://github.com/rzwitserloot/lombok](https://github.com/rzwitserloot/lombok) |
| Hutool               | Java工具类库       | [https://github.com/looly/hutool](https://github.com/looly/hutool) |
| Swagger-UI           | API文档生成工具    | [https://github.com/swagger-api/swagger-ui](https://github.com/swagger-api/swagger-ui) |
| Knife4j              | Swagger 增强框架   | [https://doc.xiaominfo.com](https://doc.xiaominfo.com)       |
| Hibernator-Validator | 验证框架           | [http://hibernate.org/validator](http://hibernate.org/validator) |
| XXL-Job              | 分布式定时任务框架 | [http://www.xuxueli.com/xxl-job](http://www.xuxueli.com/xxl-job) |
| ShardingSphere       | 分库分表           | [https://shardingsphere.apache.org](https://shardingsphere.apache.org) |

## 架构和组件设计

针对于分布式和微服务的项目来说，随着业务的发展，项目的数量上千个都是很正常的，但如何要把这些项目做好配置，做好架构设计，设计出组件库，都是要考虑的因素

既然组件库是要给其他服务提供使用，所以在设计时要考虑的细节非常的多，**设计模式和高内聚低耦合的思想更加的重要**，而且代码的健壮性和高效率的执行也是同样重要，而在本项目中，使用了SpringBoot的自动装配机制来设计组件库

除了组件库外，还有对**异常的处理、数据的封装格式、多线程的使用等等也都要进行相应的封装设计**，这些在项目中同样具备

![](https://multimedia-javaup.cn/%E6%9E%B6%E6%9E%84%E5%9B%BE/%E7%BB%84%E4%BB%B6%E6%9E%B6%E6%9E%84%E5%9B%BE.png)

## 业务流程

对于本项目来说，核心的业务就是用户选择节目然后进行购票功能了，项目中不仅完整了对整个业务流程的完整闭环，而且考虑到既然设计此项目是为了应对高并发的特点，那么在从业务的角度上也做了很多的优化设计

![](https://multimedia-javaup.cn/%E6%9E%B6%E6%9E%84%E5%9B%BE/%E4%B8%9A%E5%8A%A1%E5%9B%BE%E4%BC%98%E5%8C%96.png)	
