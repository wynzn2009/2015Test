package mediator;

public abstract class User {
	private Mediator m;
	
	public Mediator getMediator() {
		return m;
	}

	public User(Mediator m){
		this.m = m;
	}
	public abstract void work();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
