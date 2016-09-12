package 工厂方法;

public class SubOperationFactory implements OperationFactory{

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new SubOperation();
	}

}
