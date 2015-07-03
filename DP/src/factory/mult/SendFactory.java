package factory.mult;

public class SendFactory {
	public Sender produceMail(){
		return new MailSender();
	}
	public Sender produceSms(){
		return new SmsSender();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
