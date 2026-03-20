import java.io.*;
public class Except1{
	public Except1(){
		System.out.println("Except1 : construction de l'instance");
	}
	public void methodeA(int[] tab){
		System.out.println("methodeA : debut");
		try {
			System.out.println("methodeA : appel de methodeB");
			this.methodeB(tab);
			System.out.println("methodeA : retour de methodeB");
			if (tab.length > 99)
				throw new IOException();
		} catch (IOException e) {
			System.out.println("methodeA : capture : "+ e);
		} finally {
			System.out.println("methodeA : execute finally");
		}
		System.out.println("methodeA : fin");
	}
	public void methodeB(int[] t) {
		System.out.println("methodeB : debut");
		try {
			System.out.println("methodeB : tente d'acceder a t[99]");
			int a = t[99];
			System.out.println("methodeB : a reussi a acceder a t[99]");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("methodeB : capture : "+ e);
		} finally {
			System.out.println("methodeB : execute finally");
		}
		System.out.println("methodeB : fin");
	}
}