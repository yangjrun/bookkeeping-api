package cn.yangjrun.bookkeeping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author jirun.yang
 */
@SpringBootApplication
@MapperScan(basePackages = "cn.yangjrun.bookkeeping.mapper")
public class BookkeepingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookkeepingApplication.class, args);
	}

}
