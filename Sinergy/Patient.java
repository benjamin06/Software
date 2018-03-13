import java.util.ArrayList;
import java.util.Random;

public class Patient {
	private static int lastID=0;
	private int id;
	public float insurance;
	public StatePatient state;
	public double cost;
	public ArrayList<CoupleStateTime> history;
	public ProbabilityDistribution severity_probability;
	public int severity;
	
	public Patient(float insurance,StatePatient state, int cost, ProbabilityDistribution severity_probability ) {
		this.id=lastID +1;
		this.lastID +=1;
		this.insurance= insurance;
		this.cost = cost;
		this.severity_probability = severity_probability;
		setSeverity();
		this.history = new ArrayList<CoupleStateTime>();
	} 
	
	public int getSeverity() {
		return severity;
	}
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
		
	}
	public void setSeverity() {
		Random rand = new Random();
		int s = rand.nextInt(100);
		if(s==0) {
			this.severity = 1;
		}
		if(1<=s&&s<=5) {
			this.severity = 2;
		}
		if(6<=s&&s<=25) {
			this.severity = 3;
		}
		if(26<=s&&s<=60) {
			this.severity = 4;
		}
		else {
			this.severity = 5;
		}
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

	public ArrayList<CoupleStateTime> getHistory() {
		return history;
	}

	public void addHistory(CoupleStateTime statetime) {
		this.history.add(statetime);
	}
	
	
}
