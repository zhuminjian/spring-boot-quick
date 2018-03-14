package com.quick.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * http://www.cnblogs.com/boshen-hzb/p/6841982.html
 */
@SpringBootApplication
@EnableSwagger2
public class HelloApplication {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.quick.mq.controller")) //扫描API的包路径
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBootRabbitMQ") // 标题
                .description("api接口的文档整理，支持在线测试") // 描述
                .termsOfServiceUrl("http://vector4wang.tk/") //网址
                .contact("Vector.Wang") // 作者
                .version("1.0") // 版本号
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}