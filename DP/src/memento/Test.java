package memento;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Original o = new Original("����");
		
		Storage s = new Storage(o.createMemento());
		
		System.out.println("It is a "+o.getValue());
		o.setValue("����");
		System.out.println("It is a "+o.getValue());
		
		o.restoreMemento(s.getMemento());
		System.out.println("It becomes a "+o.getValue());
	}

}
