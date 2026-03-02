/**
 * Classe <b>TestToutou</b>
 * Cette classe permet de tester la classe <b>Toutou</b>
 * @see Toutou
 * @author Jessica Jonquet
 * @version 13/03/2025
 */
public class TestToutou{
	public static void main(String[] args) {
		System.out.println("* Creation d’un premier toutou");
		Toutou milou = new Toutou("Milou", Robe.BLANCHE, 4);
		
		System.out.println("* Creation d’un deuxieme toutou");
		Toutou medor = new Toutou("Medor", Robe.CHOCOLAT, -11);

		System.out.println("* Affichage des deux toutous");
		System.out.println(milou);
		System.out.println(medor);

		System.out.println("* Verifications des getters");
		System.out.println("\t" + milou.getNom());
		System.out.println("\t" + medor.getNbPuces());

		System.out.println("* Verifications des setters");
		milou.setNbPuces(-100);
		System.out.println(milou);
		medor.setNbPuces(99);
		System.out.println(medor);
		
		System.out.println("* Tests d'egalite");
		if(milou.egalA(medor))
			System.out.println("Milou et Medor sont identiques");
		else
			System.out.println("Milou et Medor sont differents");
		
		if(milou.egalA(milou))
			System.out.println("Milou et Milou sont identiques");
		else
			System.out.println("Milou et Milou sont differents");
	}
}
