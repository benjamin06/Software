
public class Message {
	private int id;
	private int time;
	private boolean state_message;
	
	
	public Message(int id, int time, boolean state_message) {
		super();
		this.id = id;
		this.time = time;
		this.state_message = state_message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public boolean isState_message() {
		return state_message;
	}
	public void setState_message(boolean state_message) {
		this.state_message = state_message;
	}
	
	
	

}
