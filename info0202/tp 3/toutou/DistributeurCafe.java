class DistributeurCafe{
	private int capaciteDosette = 10;
	private int nombreDosette;
	private int capaciteReservoir = 2;
	private int reservoir;
	private int cagnote =0;
	private double prixc;
	private double prixl;
	private Marque marque;
	public DistributeurCafe(int cd, int n,int cr,int r,int c,double pc,double pl,Marque m){
		capaciteDosette=cd;
		nombreDosette=n;
		capaciteReservoir=cr;
		cagnote=c;
		prixc=pc;
		prixl=pl;
		marque=m;
		reservoir=r;
	}
	public int getReservoir(){
		return this.reservoir;
	}
	public int getCapaciteDosette(){
		return this.capaciteDosette;
	}
	public int getNombreDosette(){
		return this.nombreDosette;
	}
	public int getCapaciteReservoir(){
		return this.capaciteReservoir;
	}
	public int getCagnote(){
		return this.cagnote;
	}
	public double getPrixc(){
		return this.prixc;
	}
	public double getPrixl(){
		return this.prixl;
	}
	public Marque getMarque(){
		return this.marque;
	}		
	public void afficher(){
		System.out.println("capacite dosette:"+this.capaciteDosette+"nombre dosette:"+ 		this.nombreDosette +"capacite du reservoir:"+this.capaciteReservoir+"cagnote:"+this.cagnote+"prix court:"+this.prixc+"prix long:"+this.prixl);
	}
	public String toString(){
		return	"capacite dosette:"+this.capaciteDosette+"nombre dosette:"+ this.nombreDosette +"capacite du reservoir:"+this.capaciteReservoir+"cagnote:"+this.cagnote+"prix court:"+this.prixc+"prix long:"+this.prixl;
	}
	public double boireCafeCourt(double somme){
		double rendu;
		if(somme<this.prixc){
			rendu=somme;
			System.out.println("pas assez d'argent");
		}else{
			rendu = somme-this.prixc;
			System.out.println("cafe court");
		}
		return rendu;
		
	}
	public double boireCafeLong(double somme){
		double rendu;
		if(somme<this.prixl){
			rendu=somme;
			System.out.println("pas assez d'argent");
		}else{
			rendu = somme-this.prixl;
			System.out.println("cafe long");
		}
		return rendu;
	}
	public void ajouterDosettes(int nbDosette,Marque marqueDosette){
		if(marqueDosette.equals(this.marque)){
			nombreDosette+=nbDosette;
			System.out.println("dosette ajouté");
		}else{
			System.out.println("dosette incompatible");
		}
	}
	public void remplirReservoir(int eau){
		if ((this.reservoir+eau)>capaciteReservoir){
			System.out.println("trop d'eau");
		}else{
			this.reservoir+=eau;
			System.out.println("eau ajouté");
		}
	}	
			
		 
	
}
