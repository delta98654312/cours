/**
 * Classe Pokemon
 * @author Jessica Jonquet
 * @version 11/02/2026
 */
import java.io.*;
import java.awt.print.PrinterException;

public class Pokemon {
    public static void main(String[] args) {


        try {
            String s = null;
            int length = s.length();
        } catch (Exception e) {
            System.out.println("Erreur : " + e);
        }


        try {
            FileOutputStream f = new FileOutputStream("pikachu.txt");
            f.write(2000);
            f.close();

            throw new PrinterException("Impression");

        } catch (Exception e) {
            System.out.println("Erreur : " + e);
        } finally {
            System.out.println("Fin de la verif");
        }


        try {
            int[] u = new int[1];
            u[2] = 33;

            u = new int[7];
            u[7] = 99 / 2;

        } catch (Exception e) {
            System.out.println("Erreur : " + e);
        } finally {
            System.out.println("Test");
        }
    }
}
