package facade;

public class Client {
	private static Facade f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f = new Facade();
		f.Activate();
		f.Deactivate();
	}

}
