package com.janita.mybatis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Janita
 * create on 2017/3/4
 * 数据源管理
 * 访问方式：localhost:port/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	
	@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.janita.mybatis.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("IAM RESTful APIs")
                .description("swagger2 构建  RESTful APIs")
                .termsOfServiceUrl("www.janita.cn/")
                .contact(new Contact("janita、zbmatsu", "www.janita.cn/", "zbmatsu@qq.com"))
                .version("v1")
                .build();
    }
}
