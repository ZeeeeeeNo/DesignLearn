package 策略模式;
/**
 * 打折优惠
 * @author caizepeng
 *
 */
public class CashRebate extends CashSupper {

	private double moneyRebate = 1;
	
	public CashRebate(double moneyRebate) {
		super();
		// TODO Auto-generated constructor stub
		this.moneyRebate = moneyRebate;
	}

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money*moneyRebate;
	}

}
