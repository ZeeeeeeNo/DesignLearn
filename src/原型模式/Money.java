package 原型模式;

import java.util.HashMap;
import java.util.Map;

public class Money implements Cloneable {

	// 面额
	private int num;
	// 印刷时间
	private String time;
	public static int s = 100;
	private Factory factory;

	public Money(Factory factory) {
		this.factory = factory.clone();
	}

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public Money() {
		System.out.println("赚钱（创建）中。。。");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Money [num=" + num + ", time=" + time + "]";
	}

	@Override
	public Money clone() {
		Money money = null;
		money = new Money(this.factory);
		money.setNum(this.num);
		money.setTime(this.time);
		return money;
	}
}
