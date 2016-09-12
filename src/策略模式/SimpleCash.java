package 策略模式;
/**
 * 正常收费
 * @author caizepeng
 *
 */
public class SimpleCash extends CashSupper{

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money;
	}

}
