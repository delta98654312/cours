package personne;

/**
 * Classe représentant une personne.
 * @author Cyril Rabat
 * @version 18/04/2016
 */
public class Personne {
    
    private String nom;
    private String prenom;
    
    /**
     * Constructeur par initialisation.
     * @param nom le nom de la personne
     * @param prenom le prénom de la personne
     */
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    /**
     * Retourne le nom de la personne.
     * @return le nom de la personne
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le prénom de la personne.
     * @return le prénom de la personne
     */    
    public String getPrenom() {
        return prenom;
    }
    
}