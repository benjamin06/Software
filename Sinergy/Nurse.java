import java.util.ArrayList;
public class Nurse extends Human_Ressources{
		
	public Nurse(int id, StatePhysician state) {
		super(id,state);
		this.waiting_queue = new ArrayList<Patient>();
	}
}
