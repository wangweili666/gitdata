package com.nasoft.spring;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableConfigServer
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {    
	
	/**
	 * 服务注册中心
	 * 容器启动主入口 
	 * @param args    
	 */
    public static void main(String[] args) {  
        new SpringApplicationBuilder(EurekaApplication.class)
                    .web(true).run(args);  
        //git测试
    }
}
