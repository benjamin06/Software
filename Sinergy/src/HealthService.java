import java.util.ArrayList;
import java.util.HashSet;


public class HealthService {
	public String name;
	public double cost;
	private HashSet<Patient> Waiting_Queue;
	private HashSet<Patient> Patient_Already_Tested;
	private double waiting;
	private Probability waiting_probability;
	
	public HealthService(String name, double cost, double waiting, Probability waiting_probability) {
		this.name = name;
		this.cost = cost;
		this.Waiting_Queue = new HashSet();
		this.Patient_Already_Tested = new HashSet();
		this.waiting = waiting;
		this.waiting_probability = waiting_probability;
	}
	
	public void add_Patient(Patient P) {
		this.Waiting_Queue.add(P);
		P.setCost(P.cost+this.cost*(1-P.insurance));
		P.state = StatePatient.Waiting;
		P.history.add((StatePatient.Waiting, P.time));
		}
	}

