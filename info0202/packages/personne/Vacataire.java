package personne;

public class Vacataire extends Personne{
    private String Entreprise;

    public Vacataire(String nom, String prenom, String e) {
        super(nom, prenom);
        this.Entreprise = e;
    }

    public Vacataire(Vacataire e){
        super(e);
        this.Entreprise = e.getEntreprise();
    }
    

    public String getEntreprise(){
        return Entreprise;
    }

    public String toString(){
        return this.getNom() + " " + this.getPrenom() +" "+ this.getEntreprise();
    }
}