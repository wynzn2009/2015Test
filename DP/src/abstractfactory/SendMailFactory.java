package abstractfactory;

public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
