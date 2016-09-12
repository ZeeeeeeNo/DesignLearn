package 简单工厂;

public class OperationSub extends Operation{

	public OperationSub(){
		
	}
	public OperationSub(double d1, double d2) {
		super(d1, d2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		return getD1()-getD2();
	}
	
}
