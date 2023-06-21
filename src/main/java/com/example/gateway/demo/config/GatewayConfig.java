package com.example.gateway.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : luohw
 * @create 2023/6/21 9:47
 */

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("springboot2-consumer",
                r -> r.path("/springboot2/**").
                        filters(f->f.stripPrefix(1)).
                        uri("lb://springboot2-consumer"))
                .build();

        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        // 创建对象对象
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        // 配置路由信息
        routes.route("xinwen",
                r -> r.path("/xinwen").
                        filters(f->f.stripPrefix(1)).
                        uri("http://www.baidu.com")).build();
        return routes.build();
    }
}
