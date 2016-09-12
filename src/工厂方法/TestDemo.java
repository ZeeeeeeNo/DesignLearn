package 工厂方法;

import org.junit.Test;

public class TestDemo {

	@Test
	public void test01(){
		OperationFactory operationFactory = new AddOperationFactory();
		Operation addOperation =  operationFactory.createOperation();
		addOperation.setD1(100);
		addOperation.setD2(30);
		System.out.println(addOperation.getResult());
	}
}
