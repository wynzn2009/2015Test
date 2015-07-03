package factory.sta;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender s = SendFactory.produceMail();
		s.Send();
	}
}
