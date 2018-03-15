import java.util.HashSet;


public class HealthService {
	public Room room;
	public double cost;
	protected HashSet<Patient> Waiting_Queue;
	protected HashSet<Patient> Patient_Already_Tested;
	private double duration;
	protected ProbabilityDistribution waiting_probability;
	
	public HealthService(Room room, double cost,ProbabilityDistribution waiting_probability) {
		this.room = room;
		this.cost = cost;
		this.Waiting_Queue = new HashSet<Patient>();
		this.Patient_Already_Tested = new HashSet<Patient>();
		this.waiting_probability = waiting_probability;
		this.duration = waiting_probability.generateSample();
	}
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
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

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public ProbabilityDistribution getWaiting_probability() {
		return waiting_probability;
	}

	public void setWaiting_probability(ProbabilityDistribution waiting_probability) {
		this.waiting_probability = waiting_probability;
	}
}



