package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.wang.mapper")
public class TkMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkMybatisApplication.class, args);
	}

}
