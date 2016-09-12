package 工厂方法;

public class SubOperation extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		return getD1()-getD2();
	}
}
