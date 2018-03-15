import java.util.ArrayList;

public class Event {
	private ArrayList<String> statut;
	public int time;
	public Patient patient;
	protected int duration;
	
	public Event(Patient patient, int time) {
		this.patient = patient;
		this.time = time;

	}
	public Event() {
		this.patient = null;
		this.time = 0;
	}
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public ArrayList<String> getStatut() {
		return statut;
	}
	public void setStatut(ArrayList<String> statut) {
		this.statut = statut;
	}
	public int getTime() {
		return time;
	}

	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
