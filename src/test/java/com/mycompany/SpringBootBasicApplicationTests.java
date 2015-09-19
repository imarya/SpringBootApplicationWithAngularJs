package com.mycompany;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.configuration.SpringBootBasicApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootBasicApplication.class)
@WebAppConfiguration
public class SpringBootBasicApplicationTests {

	@Test
	public void contextLoads() {
	}

}
