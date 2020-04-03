package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

/**
 * @author ygx_609@163.com
 * @User yuangx
 * @date 2020/3/31 16:27
 * @Description
 */

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 *
 * 实现EmbeddedServletContainerCustomizer可修改端口
 */
@SpringBootApplication
public class HelloWorldMainApplication implements EmbeddedServletContainerCustomizer {
    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8081);
    }
}
