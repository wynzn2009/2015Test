package strategy;

public class Context {
	private Strategy strategy = null;
	public Context(Strategy s){
		this.strategy = s;
	}
	public void tryIt(){
		System.out.println("Test begins");
		this.strategy.AlgorithmInterface();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
