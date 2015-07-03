package factory.common;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendFactory f = new SendFactory();
		Sender s = f.produce("sms");
		//Sender s1 = f.produce("sms1");
		try{
			s.Send();
			//s1.Send();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
