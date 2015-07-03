package command;

public class Invoker {
	private Command c;
	public Invoker(Command c){
		this.c = c;
	}
	public void action(){
		c.exe();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
