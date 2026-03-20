package animalerie;

public abstract class Insecte extends Animal{
    public Insecte(){
        super("Bob", 6,0);
    }

    public Insecte(String n, int p, int l){
        super(n,p,l);
    }

	public void afficher(){
		System.out.println(this.toString());
	}

	public String toString(){
		return (getnom() + ", insecte à "  + getnbailles() + " aile(s)");
	}
}
