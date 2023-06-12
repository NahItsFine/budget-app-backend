package com.nahitsfine.budgetapp;

import com.nahitsfine.budgetapp.controllers.TransactionTypeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nahitsfine.budgetapp.constants.TempConstant;

@SpringBootApplication
public class BudgetappApplication {

//	public BudgetappApplication () {
//		System.out.println("HELLO");
//	}

	public static void main(String[] args) {
		SpringApplication.run(BudgetappApplication.class, args);
	}

}