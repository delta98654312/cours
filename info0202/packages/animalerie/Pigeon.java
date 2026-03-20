package animalerie;

public class Pigeon extends Oiseau {
	public Pigeon(){
		super("Hector",2,2);
	}

	public Pigeon(String n, int p, int l){
        super(n,p,l);
	}

	public String toString(){
		return ("Pigeon " + getnom() + ", oiseau");
	}

	public void crier(){
		System.out.println("Rhouuuuu Rhouuuuu");
	}
}
