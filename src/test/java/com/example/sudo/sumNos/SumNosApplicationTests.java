package com.example.sudo.sumNos;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sudo.sumNos.service.AdditionService;

@SpringBootTest
class SumNosApplicationTests {

	@Autowired
	AdditionService service;
	
	@Test
	void testGetSum() {
		int a = 4,b=5;
		Assertions.assertEquals(9, service.getSum(a, b));
	}

}
