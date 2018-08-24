package cn.cleancoder.springboot.sql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@org.mybatis.spring.annotation.MapperScan(value="cn.clean.springboot.sql")
public class SqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlApplication.class, args);
	}
}
