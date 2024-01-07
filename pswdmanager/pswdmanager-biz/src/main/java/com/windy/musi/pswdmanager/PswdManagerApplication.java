package com.windy.musi.pswdmanager;

import com.windy.musi.common.feign.annotation.EnableMusiFeignClients;
import com.windy.musi.common.security.annotation.EnableMusiResourceServer;
import com.windy.musi.common.swagger.annotation.EnableMusiDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
* @author pig archetype
* <p>
* 项目启动类
*/
@EnableMusiDoc(value = "musi")
@EnableMusiFeignClients
@EnableMusiResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class PswdManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PswdManagerApplication.class, args);
    }

}
