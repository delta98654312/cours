package animalerie;

public class Chien extends Mammifere {
	public Chien(){
		super("Shadow",4);
	}
	
	public String toString(){
		return ("Chien " + getnom() + ", mammifere");
	}
	
	public void crier(){
		System.out.println("Waf Waf");
	}

}
