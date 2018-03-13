
public class CoupleStateTime {
	private StatePatient state;
	private int time;
	
	
	public CoupleStateTime(StatePatient state, int time) {
		super();
		this.state = state;
		this.time = time;
	}
	public StatePatient getState() {
		return state;
	}
	public void setState(StatePatient state) {
		this.state = state;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	

}
