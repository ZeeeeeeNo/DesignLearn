package 装饰者模式;

public class TShirts extends Finery {

	public TShirts(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("大T恤");
		super.show();
	}
	

}
