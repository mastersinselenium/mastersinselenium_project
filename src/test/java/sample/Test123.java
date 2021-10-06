package sample;

import static org.junit.Assert.assertArrayEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test123 {
	
	@Test
	void sum() {
		int a=10;
		int b=20;
		System.out.println("This method is for Sum");
		Assert.assertEquals(30,a+b);
	}
	
	@Test
	public void sub() {
		System.out.println("This method is for Sub");
		int a=20;
		int b=19;
		Assert.assertEquals(a-b, 1);
		
	}
	@Test
	public void mul() {
		System.out.println("This method is for Mul");
		int a=20;
		int b=30;
		Assert.assertEquals(600, a*b);
	}
	@Test
	public void div() {
		System.out.println("This method is used for div");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
	

}
