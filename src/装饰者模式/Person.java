package 装饰者模式;

public class Person {
	private Person(){}
	private String name;
	public Person(String name){
		this.name = name;
	}
	public void show(){
		System.out.println("Person的装扮！");
	}
}
