import java.io.*;
public class TestExcept1{
	public static void main(String[] args) {
		System.out.println("main : debut");
		Except1 ex = new Except1();
		int[] X = {0,1,2,3,4,5,6,7,8,9};
		try {
			System.out.println("main : appel de methodeA");
			ex.methodeA(X);
			System.out.println("main : retour de methodeA");
		} catch (Exception e) {
			System.out.println("main : capture : "+e);
		} finally {
			System.out.println("main : execute finally");
		}
		System.out.println("main : fin");
	}
}