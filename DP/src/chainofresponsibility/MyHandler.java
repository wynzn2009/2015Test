package chainofresponsibility;

public class MyHandler extends AbstracHandler implements Handler {
	private String name;
	public MyHandler(String name){
		this.name = name;
	}
	@Override
	public void operator() {
		// TODO Auto-generated method stub
		if(this.getIsAvailable()){
			System.out.println(name+"deal!");
		}else{
			if(getHandler()!=null){
				getHandler().operator();
			}else{
				System.out.println("No one is available");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
