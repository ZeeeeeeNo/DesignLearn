package 工厂方法;

public class Operation {
	private double d1;
	private double d2;
	public Operation(double d1,double d2){
		this.d1 = d1;
		this.d2 = d2;
		
	}
	public Operation(){
		
	}
	public double getD1() {
		return d1;
	}
	public void setD1(double d1) {
		this.d1 = d1;
	}
	public double getD2() {
		return d2;
	}
	public void setD2(double d2) {
		this.d2 = d2;
	}
	public double getResult(){
		double result = 0;
		return result;
	}
}
