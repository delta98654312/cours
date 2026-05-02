import java.util.Scanner;

public class TestPendu {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        char lettre;
        boolean fini = true;

        System.out.println("Saisir le mot d'au moins 4 lettres a deviner : ");
        String mot = clavier.nextLine();

        Pendu p = null;

        try {
            p = new Pendu(mot);
        } catch (PenduException e) {
            System.out.println("Erreur : " + e);
            return;
        }

        do {
            p.afficherEssais();
            System.out.print("\nEntrez une lettre : ");
            lettre = clavier.nextLine().charAt(0);
        } while (p.jouer(lettre) && !p.estFini());

        p.afficherEssais();

        if (p.estFini())
            System.out.println("Gagne !!!!!");
        else {
            System.out.println("Perdu :-(");
            System.out.print("\nLa solution est : " + p.getMot());
        }
    }
}