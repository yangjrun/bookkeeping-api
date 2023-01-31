package cn.yangjrun.bookkeeping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author jirun.yang
 */
@SpringBootApplication
@CrossOrigin(origins = "http://127.0.0.1")
@MapperScan("cn.yangjrun.bookkeeping.dao")
public class BookkeepingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookkeepingApplication.class, args);
	}

}
