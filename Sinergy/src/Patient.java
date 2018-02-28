import java.util.ArrayList;

public class Patient {
	private static int lastID=0;
	private int id;
	public float insurance;
	public StatePatient state;
	public double cost;
	public ArrayList<StatePatient,Time> history;
	/* créer la probabilité pour la sévérité
	 * créer le temps
	 */
	
	public Patient(float insurance, int cost) {
		this.id=lastID +1;
		this.lastID +=1;
		this.insurance= insurance;
		this.cost = cost;
		this.history = new ArrayList();
	} 
	
	public String getSeverity() {
		return severity;
	}
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getInsurance() {
		return insurance;
	}

	public void setInsurance(float insurance) {
		this.insurance = insurance;
	}

	public StatePatient getState() {
		return state;
	}

	public void setState(StatePatient state) {
		this.state = state;
	}

	public ArrayList<StatePatient, Time> getHistory() {
		return history;
	}

	public void addHistory(ArrayList<StatePatient, Time> history) {
		this.history = history;
	}
	
	
}
