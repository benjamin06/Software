public abstract class Human_Ressources{
      public hashcode id;
      public State state;
      public ArrayList<Patient> waiting_queue;
      
      public Human_Ressources(hashcode id, State state){
						this.id = id;
						this.state = state;
						this.waiting_queue = new ArrayList();
						}
			}
			
            
