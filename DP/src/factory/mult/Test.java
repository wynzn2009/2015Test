package factory.mult;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendFactory f = new SendFactory();
		Sender s = f.produceMail();
		s.Send();
	}
}
