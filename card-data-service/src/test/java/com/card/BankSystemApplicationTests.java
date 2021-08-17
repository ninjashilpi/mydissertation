package com.card;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.card.service.ConsumerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankSystemApplicationTests {

	@Autowired
	private ConsumerService consumerService;
	@Test
	public void contextLoads() {

	}

}
