package 装饰者模式;

public class Finery extends Person{
	private Person component;
	public Finery(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//打扮
	public void decorate(Person person){
		this.component = person;
	}
	public void show(){
		if(component != null)
			component.show();
		
	}

}
