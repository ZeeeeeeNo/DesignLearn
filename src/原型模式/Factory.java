package 原型模式;

//生产Money的工厂
public class Factory implements Cloneable{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Factory(String name) {
		super();
		this.name = name;
	}

	public Factory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Factory clone()  {
		// TODO Auto-generated method stub
		try {
			return (Factory) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
