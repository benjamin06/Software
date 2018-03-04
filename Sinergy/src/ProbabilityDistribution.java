import java.util.Random;
public class ProbabilityDistribution {
	public NameProbability name;
	public ProbabilityDistribution(NameProbability name, Double a, Double b) {
		super();
		this.name = name;
		this.a = a;
		this.b = b;
	}
	
	public double generateSample() {
		if(this.name == NameProbability.Exp) {
		Random rand = new Random();
		return -(1 /this.a) * Math.log( 1 - rand.nextDouble() );
		}
		if(this.name == NameProbability.LogNorm) {
			Random rand = new Random();
		return Math.log((rand.nextGaussian()-this.a)/this.b);
		}
		if(this.name == NameProbability.Uniform) {
			return((this.b-this.a)*Math.random());
		}
		else {
			return 0.0;
		}
	}
	
	
	public void setName(NameProbability name) {
		this.name = name;
	}
	public NameProbability getName() {
		return name;
	}
	public Double getA() {
		return a;
	}
	public void setA(Double a) {
		this.a = a;
	}
	public Double getB() {
		return b;
	}
	public void setB(Double b) {
		this.b = b;
	}
	public Double a;
	public Double b;
	
}
