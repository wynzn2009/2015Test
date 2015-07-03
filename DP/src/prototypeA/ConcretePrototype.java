package prototypeA;

import java.util.ArrayList;

public class ConcretePrototype implements Cloneable {
	private String name;
	private ArrayList<String> nameList = new ArrayList<String>();
	public ConcretePrototype(String name){
		this.name = name;
		this.nameList.add(this.name);
	}
	public void setName(String name){
		this.nameList.add(name);
	}
	public ArrayList<String>getNameList(){
		return this.nameList;
	}
	@SuppressWarnings("unchecked")
	public ConcretePrototype clone(){
		ConcretePrototype self = null;
		try{
			self = (ConcretePrototype) super.clone();
			self.nameList = (ArrayList<String>)this.nameList.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return self;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
