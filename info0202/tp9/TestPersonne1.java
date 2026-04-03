import personne.*;
import java.util.*;

/**
 * Classe permettant de tester les classes du package personne.
 * @author Cyril Rabat
 * @author Jessica Jonquet
 * @version 20/03/2021
 */
public class TestPersonne1 {
    
    public static Scanner clavier = new Scanner(System.in);
    
    /**
     * Création d'une personne depuis des informations saisies au clavier.
     * @return la personne créée
     */
    public static Personne creerPersonne() {
        String nom, prenom;
        
        System.out.println("Création d'une personne :");
        System.out.print("Nom               : ");
        nom = clavier.nextLine();
        System.out.print("Prénom            : ");
        prenom = clavier.nextLine();

        return new Personne(nom, prenom);
    }
    /**
     * Création d'un étudiant depuis des informations saisies au clavier.
     * @return l'étudiant créé
     */
    public static Etudiant creerEtudiant() {
        String nom, prenom;
        int numero;
        
        System.out.println("Création d'un étudiant :");
        System.out.print("Nom               : ");
        nom = clavier.nextLine();
        System.out.print("Prénom            : ");
        prenom = clavier.nextLine();
        System.out.print("Numéro d'étudiant : ");
        numero = clavier.nextInt();
        clavier.nextLine(); /* Vidage du tampon */

        return new Etudiant(nom, prenom, numero);
    }

    /**
     * Création d'un enseignant depuis des informations saisies au clavier.
     * @return l'enseignant créé
     */
    public static Enseignant creerEnseignant() {
        String nom, prenom;
        double salaire;
        
        System.out.println("Création d'un enseignant :");
        System.out.print("Nom               : ");
        nom = clavier.nextLine();
        System.out.print("Prénom            : ");
        prenom = clavier.nextLine();
        System.out.print("Salaire           : ");
        salaire = clavier.nextDouble();
        clavier.nextLine();        
        
        return new Enseignant(nom, prenom, salaire);
    }
    
    /** 
     * Méthode principale.
     * @param args les argumentssalaire
     */

    public static Vacataire creerVacataire(){
        String nom, prenom, e;
        
        System.out.println("Création d'un enseignant :");
        System.out.print("Nom               : ");
        nom = clavier.nextLine();
        System.out.print("Prénom            : ");
        prenom = clavier.nextLine();
        System.out.print("Entre           : ");
        e = clavier.nextLine();
        clavier.nextLine();        
        
        return new Vacataire(nom, prenom, e);

    }

        public static void main(String args[]) {
        Personne tableau[] = new Personne[4];

        /* Initialisation du tableau */
        tableau[0] = creerPersonne();
        tableau[1] = creerEtudiant();
        tableau[2] = creerEnseignant();
        tableau[3] = creerVacataire();

        /* Affichage du contenu du tableau */
        System.out.println("Résumé : ");
        for(int i = 0; i < tableau.length; i++)
            System.out.println(tableau[i]);

        Personne[] t2 = new Personne[tableau.length];

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] instanceof Etudiant) {
                t2[i] = new Etudiant((Etudiant) tableau[i]);
            } else if (tableau[i] instanceof Enseignant) {
                t2[i] = new Enseignant((Enseignant) tableau[i]);
            } else if (tableau[i] instanceof Vacataire){
                t2[i] = new Vacataire((Vacataire) tableau[i]);
            } else {
                t2[i] = new Personne(tableau[i]);
            }
        }

        System.out.println("Copie profonde : ");
        for(int i = 0; i < t2.length; i++)
            System.out.println(t2[i]);

    }
    
}