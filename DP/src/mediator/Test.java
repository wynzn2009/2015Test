package mediator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMediator m = new MyMediator();
		m.creatMediator();
		m.workAll();
		Mediator m1 = m.getUser1().getMediator();
		m1.workAll();
	}
}
