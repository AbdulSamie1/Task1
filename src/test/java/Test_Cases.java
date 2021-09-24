import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test_Cases {
	
	private AccountManagement objAccountTest;
	@Before
	public void setUp() {
		objAccountTest = new AccountManagement();
	}
	
	@Test
	public void test() {
		int acc = 797550;
		int expectedResult = 26000;
		int result = objAccountTest.makeDeposit(acc);
		Assert.assertEquals(expectedResult,result);
		
		acc = 581652;
		expectedResult = 159850;
		result = objAccountTest.makeDeposit(acc);
		Assert.assertEquals(expectedResult,result);
		
		acc = 169438;
		expectedResult = 2000;
		result = objAccountTest.makeDeposit(acc);
		Assert.assertEquals(expectedResult,result);
		
		acc = 581652;
		expectedResult = 159850;
		result = objAccountTest.makeWithdrawal(acc);
		Assert.assertEquals(expectedResult,result);
		
		acc = 797550;
		expectedResult = 26000;
		result = objAccountTest.makeWithdrawal(acc);
		Assert.assertEquals(expectedResult,result);
		
		acc = 169438;
		expectedResult = 2000;
		result = objAccountTest.makeWithdrawal(acc);
		Assert.assertEquals(expectedResult,result);
		
		acc = 797550;
		boolean expectedResult1 = true;
		boolean result1 = objAccountTest.checkBalance(acc);
		Assert.assertEquals(expectedResult1,result1);
		
		acc = 797550;
		expectedResult1 = true;
		result1 = objAccountTest.printStatement(acc);
		Assert.assertEquals(expectedResult1,result1);
		
		int acc1 = 797550;
		int acc2 = 581652;
		expectedResult = 159850;
		result = objAccountTest.transferAmount(acc1,acc2);
		Assert.assertEquals(expectedResult,result);
		
		acc1 = 797550;
		acc2 = 581652;
		expectedResult = 26000;
		result = objAccountTest.transferAmount(acc2,acc1);
		Assert.assertEquals(expectedResult,result);
		
		acc = 797550;
		expectedResult1 = true;
		result1 = objAccountTest.calculateZakat(acc);
		Assert.assertEquals(expectedResult1,result1);
		
		acc = 581652;
		expectedResult1 = true;
		result1 = objAccountTest.calculateInterest(acc);
		Assert.assertEquals(expectedResult1,result1);
		
		acc = 581652;
		expectedResult1 = true;
		result1 = objAccountTest.displayAllDeductions(acc);
		Assert.assertEquals(expectedResult1,result1);
		
		acc = 797550;
		expectedResult1 = true;
		result1 = objAccountTest.displayAllDeductions(acc);
		Assert.assertEquals(expectedResult1,result1);
		
		expectedResult1 = true;
		result1 = objAccountTest.createAcc();
		Assert.assertEquals(expectedResult1,result1);
		
		expectedResult1 = true;
		result1 = objAccountTest.Account();
		Assert.assertEquals(expectedResult1,result1);
		
		acc = 169438;
		expectedResult1 = true;
		result1 = objAccountTest.closeAccount(acc);
		Assert.assertEquals(expectedResult1,result1);
	}

}
