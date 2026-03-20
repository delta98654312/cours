package animalerie;

public abstract class Mammifere extends Animal {
	public Mammifere (){
		super("bob",4, 0);
	}
	public Mammifere (String nom, int n){
		super(nom,n,0);
	}

	public void afficher(){
		System.out.println(this.toString());
	}
	
	public String toString(){
		return (getnom() + ", mammifere à " + getnbpattes() + " pattes");
	}
}
