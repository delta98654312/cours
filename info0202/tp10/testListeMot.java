import java.util.Scanner;

public class testListeMot {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        char lettre;

        System.out.println("Nom du fichier :");
        String mot = clavier.nextLine();

        ListeMots lst = new ListeMots(mot);

        System.out.println("add :");
        String test = clavier.nextLine();

        lst.ajouterMot(test);


        for (int i = 0; i < lst.getTaille(); i++) {
            System.out.println("- " + lst.getMot(i));
        }

        clavier.close();



        
    }
}