package factory.common;

public class SendFactory {
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("Not Found");
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
