package chainofresponsibility;

public abstract class AbstracHandler {
	private Handler handler;
	private Boolean isAvailable = false;
	
	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
