package cn.fy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("cn.fy.mapper")
public class IdeaspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdeaspringbootApplication.class, args);
    }

}
