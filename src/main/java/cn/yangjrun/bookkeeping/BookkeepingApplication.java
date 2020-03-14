package cn.yangjrun.bookkeeping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author jirun.yang
 */
@SpringBootApplication
@CrossOrigin(origins = "http://127.0.0.1")
public class BookkeepingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookkeepingApplication.class, args);
	}

}
