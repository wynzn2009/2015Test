package factory.sta;

public class SendFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
