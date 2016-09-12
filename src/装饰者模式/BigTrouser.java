package 装饰者模式;

public class BigTrouser extends Finery{

	public BigTrouser(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("垮裤");
		super.show();
	}

}
