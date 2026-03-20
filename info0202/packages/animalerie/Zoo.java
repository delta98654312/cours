package animalerie;


public class Zoo implements IZoo{
	private int nbcages;
	private Animal [] cages;
	private static final int min = 10;
	private static final int max = 20;
	
	public Zoo(){
		this.nbcages = (int) Math.random()*min+(max-min);
		this.cages = new Animal [this.nbcages];
	}
	
	public void ajouterAnimal(Animal a, int i){
		this.cages[i] = a;
	}
	
    public Animal getAnimal(int i){
    	return this.cages[i];
    }

    public void supprimerAnimal(int i){
    	this.cages[i] = null;
    }

    public void faireCrier(){
    	for (int i=0;i<nbcages;i++){
    		if (this.cages[i] != null)
    			this.cages[i].crier();
    	}
    }

	public String toString(){
		String message = "";
    	for (int i=0;i<nbcages;i++){
    		message += "Cage numero: " + i + " contien l'animal: " + this.cages[i].getnom() + " ";
    	}

    	return message;
    }
	
}
