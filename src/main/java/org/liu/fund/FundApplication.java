package org.liu.fund;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author liu
 */
@EnableScheduling
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("org.liu.fund.dao.mapper")
public class FundApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundApplication.class, args);
	}

}
