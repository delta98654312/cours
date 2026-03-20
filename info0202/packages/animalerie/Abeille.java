package animalerie;

public class Abeille extends Insecte {
	public Abeille(){
		super("Maya",4,4);
	}

	public String toString(){
		return ("Abeille " + getnom() + ", insecte à " + getnbailles() + "aile(s)");
	}

	public void crier(){
		System.out.println("Bzzzzzzzzzzzzzzz");
	}
}
