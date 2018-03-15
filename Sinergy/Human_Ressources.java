import java.util.ArrayList;

public abstract class Human_Ressources{
      private int lastID=0;
      public StatePhysician state;
      public ArrayList<Patient> waiting_queue;
      protected ProbabilityDistribution probability;
      protected int duration;
      
      public Human_Ressources(int id, StatePhysician state,ProbabilityDistribution probability){
	     this.lastID = id;
	     this.state = state;
	     this.waiting_queue = new ArrayList<Patient>();
	     this.probability = probability;
	     this.duration = (int) probability.generateSample();
      }

	public ProbabilityDistribution getProbability() {
		return probability;
	}

	public void setProbability(ProbabilityDistribution probability) {
		this.probability = probability;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getLastID() {
		return lastID;
	}

	public void setLastID(int lastID) {
		this.lastID = lastID;
	}

	public StatePhysician getState() {
		return state;
	}

	public void setState(StatePhysician state) {
		this.state = state;
	}

	public ArrayList<Patient> getWaiting_queue() {
		return waiting_queue;
	}

	public void setWaiting_queue(ArrayList<Patient> waiting_queue) {
		this.waiting_queue = waiting_queue;
	}
}
			
            
