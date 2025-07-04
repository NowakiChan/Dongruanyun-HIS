package com.neuedu.his;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@SpringBootApplication
@MapperScan("com.neuedu.his.mapper")
public class HisServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HisServerApplication.class, args);
	}

}
