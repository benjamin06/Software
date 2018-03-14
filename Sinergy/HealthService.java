import java.util.HashSet;


public class HealthService {
	public String name;
	public double cost;
	private HashSet<Patient> Waiting_Queue;
	private HashSet<Patient> Patient_Already_Tested;
	private double waiting;
	private ProbabilityDistribution waiting_probability;
	
	public HealthService(String name, double cost,ProbabilityDistribution waiting_probability) {
		this.name = name;
		this.cost = cost;
		this.Waiting_Queue = new HashSet<Patient>();
		this.Patient_Already_Tested = new HashSet<Patient>();
		this.waiting_probability = waiting_probability;
		this.waiting = waiting_probability.generateSample();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public HashSet<Patient> getWaiting_Queue() {
		return Waiting_Queue;
	}

	public void setWaiting_Queue(HashSet<Patient> waiting_Queue) {
		Waiting_Queue = waiting_Queue;
	}

	public HashSet<Patient> getPatient_Already_Tested() {
		return Patient_Already_Tested;
	}

	public void setPatient_Already_Tested(HashSet<Patient> patient_Already_Tested) {
		Patient_Already_Tested = patient_Already_Tested;
	}

	public double getWaiting() {
		return waiting;
	}

	public void setWaiting(double waiting) {
		this.waiting = waiting;
	}

	public ProbabilityDistribution getWaiting_probability() {
		return waiting_probability;
	}

	public void setWaiting_probability(ProbabilityDistribution waiting_probability) {
		this.waiting_probability = waiting_probability;
	}
}



