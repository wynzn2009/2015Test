package strategy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strategy s = new ConcreteStrategyC();
		Context c = new Context(s);
		c.tryIt();
	}

}
