
package com.rajeshpatkar.components.miscellaneous.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.rajeshpatkar.components.miscellaneous.PiggyBank;

public class PiggyBankTest {
 PiggyBank piggyBank;
	
	@Test
	public void testPiggyBankStringInt() {
		
		PiggyBank piggyBank = new PiggyBank("User1", 5000);
		assertEquals("User1", piggyBank.getName());
		assertEquals(5000, piggyBank.getBalance());
	}

	@Test
	public void testPiggyBankString() {
		PiggyBank piggyBank = new PiggyBank("User2");
		assertEquals("User2", piggyBank.getName());
		assertEquals(300, piggyBank.getBalance());
	}

// For each test cases run before test	
	@Before
	public void setUp(){
		piggyBank = new PiggyBank("User1", 5000);	
	}
	
	@Test
	public void testDeposit() {
	
		piggyBank.deposit(1000);
		
		assertEquals(6000,piggyBank.getBalance());
	
	}

	@Test
	public void testWithdraw() {

		piggyBank.withdraw(1000);
		
		assertEquals(4000,piggyBank.getBalance());
	
	}

}
