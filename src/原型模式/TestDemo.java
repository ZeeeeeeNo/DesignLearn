package 原型模式;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestDemo {

	@Test
	public void test01(){
		Money m1 = new Money();
		m1.setNum(1);
		m1.setTime("2014");
		m1.setFactory(new Factory("龙岗印刷厂"));
		
		Money m2 = m1.clone();
		m2.setNum(1);
		m2.setNum(10000);
		m2.getFactory().setName("小梅沙印刷厂");
		
		System.out.println(m1.getFactory().getName());
		System.out.println(m2.getFactory().getName());
//		System.out.println(m1.getMap().get("生产日期"));
//		System.out.println(m2.getMap().get("生产日期"));
	}
}
