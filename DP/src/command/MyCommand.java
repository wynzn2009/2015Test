package command;

public class MyCommand implements Command {
	private Receiver r;
	public MyCommand(Receiver r){
		this.r = r;
	}

	@Override
	public void exe() {
		// TODO Auto-generated method stub
		r.action();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
