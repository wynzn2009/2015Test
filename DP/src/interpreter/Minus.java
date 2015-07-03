package interpreter;

public class Minus implements Expression {

	@Override
	public int interpret(Context c) {
		// TODO Auto-generated method stub
		return c.getNum1()-c.getNum2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
