package memento;

public class Storage {
	private Memento memento;
	public Storage(Memento m){
		this.memento = m;
	}
	
	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
