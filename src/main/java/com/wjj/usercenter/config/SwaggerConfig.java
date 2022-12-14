//package com.wjj.usercenter.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// *  自定义 Swagger 接口文档的配置
// */
//
////表示这个类是一个配置类,会把这个类注入到ioc容器中
//@Configuration
////开启swagger2的功能
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                //这里一定要标注你控制器的位置
//                .apis(RequestHandlerSelectors.basePackage("com.wjj.usercenter.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    /**
//     * api 信息
//     * @return
//     */
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("用户中心")
//                .description("用户中心接口文档")
//                .termsOfServiceUrl("https://angegit.gitee.io/myblog/")
//                .contact(new Contact("wjj","https://angegit.gitee.io/myblog/","xxx@qq.com"))
//                .version("1.0")
//                .build();
//    }
//}
//
