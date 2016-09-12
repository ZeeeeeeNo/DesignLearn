package 简单工厂;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void test01(){
		Operation operation = OperationFactory.createOperation("+");
		operation.setD1(100);
		operation.setD2(50);
		System.out.println(operation.getResult());
	}
}

