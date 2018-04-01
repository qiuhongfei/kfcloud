package com.zk.kfcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zk.kfcloud.Dao")
public class KfcloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(KfcloudApplication.class, args);
	}
}
