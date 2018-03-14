
# 前言
　　自己很早就想搞一个总的仓库就是将自己平时遇到的和学习到的东西整合在一起，方便后面用的时候快速的查找与使用，之前是通过branch
的方式去整理，感觉不直观，一咬牙就花了点时间将所有的分支整合在一起（之前使用branch方式的兄dei，这里对不住了，你们可以将之前的干掉，重新克隆总的），方便自己也方便大家参考，以下是我的相关博客，有兴趣的
可以去浏览浏览，觉得对自己有点启发或者解决了一些问题，可以点个赞~

- CSDN：http://blog.csdn.net/qqhjqs?viewmode=list
- 博客：http://vector4wang.tk/
- 简书：https://www.jianshu.com/u/223a1314e818
- Github:https://github.com/vector4wang
- Gitee:https://gitee.com/backwxc

```bash
.
├── pom.xml
├── qucik-activemq
├── quick-batch
├── quick-docker
├── quick-ElasticSearch
├── quick-exception
├── quick-idea
├── quick-img2txt
├── quick-jdbc
├── quick-jpa
├── quick-jsp
├── quick-log
├── quick-logback
├── quick-modules
├── quick-multi-data
├── quick-mybatis-druid
├── quick-oauth2
├── quick-okhttp
├── quick-oss
├── quick-package-assembly
├── quick-package-assembly-multi-env
├── quick-rabbitmq
├── quick-redies
├── quick-rocketmq
├── quick-simhash
├── quick-spark
├── quick-swagger
├── quick-thread
├── quick-tika
├── quick-wx-api
├── README.md

```

## spring-boot-quick
基于springboot的快速学习示例


## 所有分支介绍

## quick-idea

- 自己用idea的配置
- ignore的模板

## quick-crawler 平时的爬虫

- 领英爬虫
- 百度搜索领英种子url爬虫和"随机应变"的处理方式 （没想到现在对领英爬虫的需求这么大，最近给一个客户开了自动抓取领英数据的系统，处于安全，就把代码删掉了）
- 一键导出CSDN某用户的所有博客内容并转换为MD格式到本地

已经将爬虫模块迁移到[crawlers](https://github.com/vector4wang/Crawlers)

## quick-swagger 

 - web接口的规范化示例
 - 添加了当传递参数为对象时，如何使用swagger注解
 
 注意:*如果接受参数是已@RequestBody方式并且参数中包含日期类型的参数，可在对应模型的日期属性上面添加`@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")`注解*
 如
```java
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh" , timezone="GMT+8") // 注意时区的设置
    private Date birthday; // 出生日期
```



## quick-thread 
java线程池Executor的示例


## quick-modules  
springboot 模块化开发示例


## quick-mybatis-druid
springboot整合mybatis和阿里云的druid监控功能，日志可以控制sql的输出
添加springboot的health监控，链接如下

| HTTP方法 | 路径 | 描述 | 鉴权 |
|---|---|---|---|
| GET | /autoconfig | 查看自动配置的使用情况，该报告展示所有auto-configuration候选者及它们被应用或未被应用的原因 | true |
| GET | /configprops | 显示一个所有@ConfigurationProperties的整理列表 | true |
| GET | /beans | 显示一个应用中所有Spring Beans的完整列表 | true |
| GET | /dump | 打印线程栈 | true |
| GET | /env | 查看所有环境变量 | true |
| GET | /env/{name} | 查看具体变量值 | true |
| GET | /health | 查看应用健康指标 | false |
| GET | /info | 查看应用信息 | false |
| GET | /mappings | 查看所有url映射 | true |
| GET | /metrics | 查看应用基本指标 | true |
| GET | /metrics/{name} | 查看具体指标 | true |
| POST | /shutdown | 允许应用以优雅的方式关闭（默认情况下不启用） | true |
| GET | /trace | 查看基本追踪信息 | true |

## quick-multi-data
- springboot mybatis 多数据源配置，别忘了为多数据源的连接池配置
- 改为druid多数据源，方便监控数据库查询和性能
 

## quick-spark 
springboot整合spark示例


## quick-package-assembly 

- maven打包示例包含jar的启动与停止脚本(简单粗暴，慎重考虑再使用)
- 使用assembly打包mybatis产生的xml时，可将对应mapperxml文件放在resources文件，然后再application.properties里配置对应路径，如
 `mybatis.mapperLocations=classpath:mapper/*.xml` 这里需要注意一下

## quick-package-assembly-multi-env
程序 依赖包 分开化的多环境部署

## quick-tika 
apache的文本抽取开源框架，整合到springboot中


## quick-ElasticSearch 
关于es搜索的相关内容
     现在在学习Elasticsearch+Logstash+Kibana 后续会有相关博文、和代码示例~

注意：想要用好es，搜索是关键
 
 
## quick-img2txt 图片与文字转换的程序示例
- 文字转换成图片
- 图片转换为txt，可作为一些程序启动的注释，如佛祖注释，spring启动注释，等等，可以根据你输入的图片制作(背景一定要为白色)，如

前方预警！！！！

![转换前](https://ooo.0o0.ooo/2017/06/11/593c2c1d64882.jpg)
![转换后](https://ooo.0o0.ooo/2017/06/11/593c2a4b4980f.jpg)
-  **验证码识别** 使用easyocr(项目地址)提供的api接口，可以识别验证码，这简直是小虫子的福利，就问你怕不怕!
- 自己在阿里云搭了一个服务，可以在线转换，自己做着玩玩，有兴趣的可以试一试，入口->[传送门](http://60.205.191.82:8001/img2txt)


## quick-batch 

spring下的批量处理大数据模块，这里是从mysql里读取然后再写入mysql中，可以借鉴下，来源https://github.com/geekyjaat/spring-batch

## quick-rabbit

rabbit模块
做了个接口服务

![ui](http://upload-images.jianshu.io/upload_images/3167229-945c72c2569f754a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


## quick-exception

springboot下统一处理异常方法，即，在请求没到达对应controller报错之后的处理方法，比如404,400和500错误，此处返回的是json字符串，页面的暂时没有

## quick-log

- 使用log4j2作为日志体系。主要实现的功能
- 控制台输出的是error日志，但是日志文件里存的是info和error日志，并且按年月日生成对应日志文件
- 控制台颜色输出插件:Grep console
- 使用AOP输出每个请求的详细日志

## quick-wx-api
自己开发的小程序(哇哦窝)使用到的api，非常简单，里面集成了阿里封装的httpclient工具包，挺好用的。

## quick-jsp
前段时间一直没有搞定在springboot中使用jsp，今天抽了点时间搞定了，有几点需要注意的地方

- 创建项目的时候这样选择"spring initializr-->web",ok之后的项目的resource下会有tamplates包，可以删掉
- 创建webapp/WEB-INF目录(具体根据自己喜好，只要在配置文件写对路径就可以了)
- 然后在pom文件中添加一下配置，目的是为了让webapp下的jsp文件留在META-INF中，让boot访问到
```xml
<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<executions>
					<execution>
						<goals>
							<goal>repackage</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<configuration>
					<failOnMissingWebXml>false</failOnMissingWebXml>
				</configuration>
			</plugin>
		</plugins>
		<resources>
			<!-- 打包时将jsp文件拷贝到META-INF目录下-->
			<resource>
				<!-- 指定resources插件处理哪个目录下的资源文件 -->
				<directory>src/main/webapp</directory>
				<!--注意此次必须要放在此目录下才能被访问到-->
				<targetPath>META-INF/resources</targetPath>
				<includes>
					<include>**/**</include>
				</includes>
			</resource>
			<resource>
				<directory>src/main/resources</directory>
				<includes>
					<include>**/**</include>
				</includes>
				<filtering>false</filtering>
			</resource>
		</resources>
```

## quick-redis
工作上用到了redis，就添加了redis模块，很简单有key就获取，没有就插入

## quick-rocketmq
此处的不是Apache 的Rocketmq，是阿里云服务上的一个消息队列

## quick-logback
springboot內置的日志管理模块，使用slf4j

## quick-activemq
springboot 整合activemq 服务 非常简单，更负责的配置可以自定义containerFactory

## quick-docker

使用docker部署springboot的示例demo，更多内容请见blog

---

(后面会持续更新)



### 温馨提示
　　如果您自己想在本地跑一跑，可以将其checkout到本地，直接`mvn clean install -U` 就ok了，如果您只想运行某个模块，直接复制配置文件和代码就ok了，如果您在测试某个模块但该模块出错，请尽快联系本人,邮箱:**vector4wang@qq.com**,我会在第一时间将其修复

欢迎star和fork
