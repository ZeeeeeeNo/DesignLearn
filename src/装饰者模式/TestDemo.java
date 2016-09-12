package 装饰者模式;

import org.junit.Test;

public class TestDemo {

	@Test
	public void test01(){
		BigTrouser biTrouser = new BigTrouser("哈哈");
		TShirts tsShirts = new TShirts("呵呵");
		Person person = new Person("李白");
	
		//Person的穿衣服的方法
		/**
		 * 但是服饰有很多种，先在原有的基础上，穿个垮裤
		 * 然后在穿上T恤
		 */
		biTrouser.decorate(person);
		tsShirts.decorate(biTrouser);
		tsShirts.show();
	}
}
