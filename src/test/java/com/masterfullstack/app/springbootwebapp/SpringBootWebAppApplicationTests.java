package com.masterfullstack.app.springbootwebapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@Sql({"/db/schema_test.sql","/db/test_cars.sql"})
class SpringBootWebAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
