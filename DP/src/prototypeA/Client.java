package prototypeA;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretePrototype p = new ConcretePrototype("����");
		System.out.println(p.getNameList());
		
		ConcretePrototype p2 = p.clone();
		p2.setName("����");
		System.out.println(p2.getNameList());
		System.out.println(p.getNameList());
	}

}
