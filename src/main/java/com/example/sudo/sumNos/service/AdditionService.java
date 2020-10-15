package com.example.sudo.sumNos.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {

	public int getSum(int a, int b) {			
		return a+b;		
	}
}
