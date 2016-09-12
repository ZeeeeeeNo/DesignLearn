package 简单工厂;

public class OperationFactory {

	public static  Operation createOperation(String operate){
		Operation oper = null;
		switch (operate) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		default:
			break;
		}
		return oper;
	}
}
