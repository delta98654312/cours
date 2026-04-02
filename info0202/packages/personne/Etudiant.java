package personne;

/**
 * Classe représentant un étudiant.
 * @author Cyril Rabat
 * @version 18/04/2016
 */
public class Etudiant extends Personne {
    
    private int numeroEtudiant;
    
    /**
     * Constructeur par initialisation.
     * @param nom le nom de l'étudiant
     * @param prenom le prénom de l'étudiant
     * @param numero le numéro d'étudiant
     */
    public Etudiant(String nom, String prenom, int numero) {
        super(nom, prenom);
        this.numeroEtudiant = numero;
    }
    
     /**
     * Retourne le numéro d'étudiant de l'étudiant.
     * @return le numéro d'étudiant
     */
    public int getNumeroEtudiant() {
        return numeroEtudiant;
    } 
 
}