package animalerie;

public abstract class Oiseau extends Animal{
    public Oiseau(){
        super("Bob", 2,2);
    }

    public Oiseau(String n, int p, int l){
        super(n,p,l);
    }

	public void afficher(){
		System.out.println(this.toString());
	}

	public String toString(){
		return (getnom() + ", oiseau");
	}
}
