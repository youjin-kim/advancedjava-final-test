package prob2;

public class Sub implements Arithmetic {
	private int a, b;

	@Override
	public int calculate(int a, int b) {
		this.a = a;
		this.b = b;
		return (a - b);
	}

}
