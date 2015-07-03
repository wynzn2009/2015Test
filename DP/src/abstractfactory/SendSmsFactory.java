package abstractfactory;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
