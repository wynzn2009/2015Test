package facade;

public class Facade {
	private static Camera c1,c2;
	private static Light l1;
	private static Alarm a1,a2;
	Facade(){
		c1 = new Camera();
		c2 = new Camera();
		l1 = new Light();
		a1 = new Alarm();
		a2 = new Alarm();
	}
	public void Activate(){
		c1.TurnOn();
		l1.TurnOn();
		a1.Activate();
		c2.TurnOn();
		a2.Activate();
	}
	public void Deactivate(){
		a2.Deactivate();
		l1.TurnOff();
		a1.Deactivate();
		c1.TurnOff();
		c2.TurnOff();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
