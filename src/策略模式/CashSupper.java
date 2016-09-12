package 策略模式;

/**
 * 促销算法的抽象类，对原价进行计算后返回
 * @author caizepeng
 *
 */
public abstract class CashSupper {
	public abstract double acceptCash(double money);
}
