package com.example.BakrService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // ✅ Включаем поддержку Feign

public class BakrServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BakrServiceApplication.class, args);
	}

}
