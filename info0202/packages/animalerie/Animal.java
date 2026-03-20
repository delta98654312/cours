package animalerie;

public abstract class Animal implements IAnimal {
	private String nom;
	private int nbpattes;
	private int nbaile;
	public Animal() {
		this.nom = "Default";
		this.nbpattes = 4;
		this.nbaile = 0;
	}
	
	public Animal(String a, int n, int l){
		this.nom = a;
		this.nbpattes = n;
		this.nbaile = l;
	}
	
	public void setnom(String nom){
		this.nom = nom;
	}
	
	public void setnbpattes(int nb){
		this.nbpattes = nb;
	}
	
	public String getnom(){
		return this.nom;
	}
	
	public int getnbpattes(){
		return this.nbpattes;
	}

	public int getnbailles(){
		return this.nbaile;
	}

	public void setnbaile(int nb){
		this.nbaile = nb;
	}
	
	public void afficher(){
		System.out.println(toString());
	}
	
	public String toString(){
		return (getnom() + ", animal à " + getnbpattes() + " pattes" + " et " + this.nbaile + " aile(s)");
	}
	
	public abstract void crier();
}
