package command;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver r = new Receiver();
		Command c = new MyCommand(r);
		Invoker i = new Invoker(c);
		i.action();
	}

}
