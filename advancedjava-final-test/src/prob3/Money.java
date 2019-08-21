package prob3;

public class Money {
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money() {
	}
	

	public Object add(Money money) {
		Money nw = new Money();
		nw.amount = amount + money.amount;
		return nw;
	}

	public Object minus(Money money) {
		Money nw = new Money();
		nw.amount = amount - money.amount;
		return nw;
	}

	public Object multiply(Money money) {
		Money nw = new Money();
		nw.amount = amount * money.amount;
		return nw;
	}

	public Object devide(Money money) {
		Money nw = new Money();
		nw.amount = amount / money.amount;
		return nw;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object myMoney) {
		if(myMoney instanceof Money) {
			if(((Money) myMoney).amount == amount) {
				return true;
			}
			
		}
		return false;
	}
	
	
	
	

}
