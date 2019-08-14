package com.atguigu.gmall0311test.gmallusermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall0311test.gmallusermanage.mapper")
public class Gmall0311testApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gmall0311testApplication.class, args);
    }

}
