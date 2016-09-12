package 工厂方法;

public class AddOperationFactory implements OperationFactory{

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new AddOperation();
	}

}
