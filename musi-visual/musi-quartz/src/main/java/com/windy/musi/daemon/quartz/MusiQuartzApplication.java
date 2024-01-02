package com.windy.musi.daemon.quartz;

import com.windy.musi.common.feign.annotation.EnableMusiFeignClients;
import com.windy.musi.common.security.annotation.EnableMusiResourceServer;
import com.windy.musi.common.swagger.annotation.EnableMusiDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author frwcloud
 * @date 2023-07-05
 */
@EnableMusiDoc("job")
@EnableMusiFeignClients
@EnableMusiResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class MusiQuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusiQuartzApplication.class, args);
	}

}
