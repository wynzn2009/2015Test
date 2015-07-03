package prototypeA;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretePrototype p = new ConcretePrototype("°×ÒÏ");
		System.out.println(p.getNameList());
		
		ConcretePrototype p2 = p.clone();
		p2.setName("ÂìÒÏ");
		System.out.println(p2.getNameList());
		System.out.println(p.getNameList());
	}

}
