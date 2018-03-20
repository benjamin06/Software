import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre d'infirmi�res : ");
		int nurse_number = sc.nextInt();
		System.out.println("Nombre de m�decins : ");
		int physician_number = sc.nextInt();
		System.out.println("Nombre de transporteurs : ");
		int transporter_number = sc.nextInt();
		System.out.println("Temps en minutes : ");
		int time_max = sc.nextInt();
		ArrayList<Nurse> nurses = new ArrayList<Nurse>();
		ArrayList<Transporter> transporters = new ArrayList<Transporter>();
		ArrayList<Physician> physicians = new ArrayList<Physician>();
		ProbabilityDistribution nurse_probability = null;
		ProbabilityDistribution transporter_probability = null;
		ProbabilityDistribution physician_probability = null;
		
		class NameException extends Exception{
			public NameException() {
				System.out.println("Loi inconnue");
			}
		}
		

		System.out.println("Loi de probabilit� d'attente pour l'inscription : ");
		
			if(sc.nextLine()!="Exp" && sc.nextLine() != "LogNorm" && sc.nextLine() != "Gamma" && sc.nextLine() != "Uniform") {
				nurse_probability = null;
			}
		
			else {
				if(sc.nextLine() == "Exp") {
					System.out.println("Param�tre lambda :");
					nurse_probability = new ProbabilityDistribution(NameProbability.Exp,sc.nextDouble(),0.0);
					}
				
				if(sc.nextLine() == "LogNorm") {
					System.out.println("Param�tre a : ");
					double a = sc.nextDouble();
					System.out.println("Param�tre b : ");
					double b = sc.nextDouble();
					nurse_probability = new ProbabilityDistribution(NameProbability.LogNorm,a,b);
					}
				
				if(sc.nextLine() == "Uniform") {
					System.out.println("Param�tre a : ");
					double a = sc.nextDouble();
					System.out.println("Param�tre b : ");
					double b = sc.nextDouble();
					nurse_probability = new ProbabilityDistribution(NameProbability.Uniform,a,b);
				}
				
				if(sc.nextLine() == "Gamma") {
					nurse_probability = null;
				}
	}	
				
				
				
	System.out.println("Loi de probabilit� d'attente pour le transport : ");
				
				if(sc.nextLine()!="Exp" && sc.nextLine() != "LogNorm" && sc.nextLine() != "Gamma" && sc.nextLine() != "Uniform") {
					transporter_probability = null;
				}
				else {
					if(sc.nextLine() == "Exp") {
						System.out.println("Param�tre lambda :");
						transporter_probability = new ProbabilityDistribution(NameProbability.Exp,sc.nextDouble(),0.0);
						}
					}
					
					if(sc.nextLine() == "LogNorm") {
						System.out.println("Param�tre a : ");
						double a = sc.nextDouble();
						System.out.println("Param�tre b : ");
						double b = sc.nextDouble();
						transporter_probability = new ProbabilityDistribution(NameProbability.LogNorm,a,b);
						}
					
					if(sc.nextLine() == "Uniform") {
						System.out.println("Param�tre a : ");
						double a = sc.nextDouble();
						System.out.println("Param�tre b : ");
						double b = sc.nextDouble();
						transporter_probability = new ProbabilityDistribution(NameProbability.Uniform,a,b);
					}
					
					if(sc.nextLine() == "Gamma") {
						transporter_probability = null;
					}
					
	System.out.println("Loi de probabilit� d'attente pour la consultation : ");
					
					if(sc.nextLine()!="Exp" && sc.nextLine() != "LogNorm" && sc.nextLine() != "Gamma" && sc.nextLine() != "Uniform") {
						physician_probability = null;
					}	
					else {
						if(sc.nextLine() == "Exp") {
							System.out.println("Param�tre lambda :");
							physician_probability = new ProbabilityDistribution(NameProbability.Exp,sc.nextDouble(),0.0);
							}
						}
						
						if(sc.nextLine() == "LogNorm") {
							System.out.println("Param�tre a : ");
							double a = sc.nextDouble();
							System.out.println("Param�tre b : ");
							double b = sc.nextDouble();
							physician_probability = new ProbabilityDistribution(NameProbability.LogNorm,a,b);
							}
						
						if(sc.nextLine() == "Uniform") {
							System.out.println("Param�tre a : ");
							double a = sc.nextDouble();
							System.out.println("Param�tre b : ");
							double b = sc.nextDouble();
							physician_probability = new ProbabilityDistribution(NameProbability.Uniform,a,b);
						}
						
						if(sc.nextLine() == "Gamma") {
							physician_probability = null;
						}
		
		
		for(int i = 1; i<=nurse_number; i++) {
			nurses.add(new Nurse(i,StatePhysician.Idle,nurse_probability));
		}
		for(int i = 1; i<=transporter_number; i++) {
			transporters.add(new Transporter(i,StatePhysician.Idle,transporter_probability));
		}
		for(int i = 1; i<=physician_number; i++) {
			physicians.add(new Physician(i,StatePhysician.Idle,physician_probability));
		}
		
			
	}

}
