package org.liu.fund.config;

import java.util.List;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.google.common.collect.Lists.newArrayList;

/**
 * @author liu
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.liu.fund.controller"))
                .paths(PathSelectors.any())
                .build()
//                .securitySchemes(security())
                .apiInfo(new ApiInfoBuilder()
                        .title("MedicalApp—be")
                        .description("MedicalApp—be detail")
                        .version("1.0")
                        .build()

                );
    }

    private List<ApiKey> security() {
        return newArrayList(
                new ApiKey("Authorization", "Authorization", "header")
        );
    }
}
