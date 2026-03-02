/**
 * Classe <b>Toutou</b>
 * Cette classe permet de repr&eacute;senter un chien qui est caract&eacute;ris&eacute; uniquement par son nom, sa robe et son nombre de puces.
 * @see Robe
 * @author Jessica Jonquet
 * @version 13/03/2025
 */
public class Toutou {
	
	/**
	 * Le nom du chien
	 */
	private String nom;

	/**
	 * La robe du chien
	 * @see Robe
	 */
	private Robe robe;

	/**
	 * Le nombre de puces du chien
	 */
	private int nbPuces;

	/**
	 * Constructeur par d&eacute;faut de la classe <b>Toutou</b>
	 */
	public Toutou(){
		nom = "SnoopyX";
		robe = Robe.BLANCHE;
		nbPuces = 0;
	}

	/**
	 * Constructeur par initialisation de la classe <b>Toutou</b>
	 * @param n le nom du chien
	 * @param r la robe du chien
	 * @param nb le nombre de puces du chien (positif)
	 * @see Robe
	 */
	public Toutou (String n, Robe r, int nb){
		nom = n;
		try{
			if (nb >0){
				throw new IllegalArgumentException();
			}else
				nb = nbPuces;
		}catch (Exception e){
			System.out.println("Erreur: " + e);
		}finally{
			System.out.println("puce set");
		}
			
		robe = r;
	}

	/**
	 * Retourne le nom du chien
	 * @return le nom du chien
	 */
	public String getNom(){return nom;}

	/**
	 * Retourne le nombre de puces du chien
	 * @return le nombre de puces du chien
	 */
	public int getNbPuces(){return nbPuces;}

	/**
	 * Retourne la robe du chien
	 * @see Robe
	 * @return la robe du chien
	 */
	public Robe getRobe(){return robe;}

	/**
	 * Modifie le nombre de puces du chien
	 * @param nb le nombre de puces (positif)
	 */
	public void setNbPuces(int nb) {
		try{
			if (nb >0){
				throw new IllegalArgumentException();
			}else
				nbPuces = nb;
		}catch (Exception e){
			System.out.println("Erreur: " + e);
		}finally{
			System.out.println("puce set");
		}
	}

	/**
	 * M&eacute;thode toString pour la classe <b>Toutou</b>
	 * @return une cha&icirc;ne de caract&egrave;res repr&eacute;sentant le chien
	 */
	public String toString() {
		return nom + ", de robe "+ robe +", a " + nbPuces + " puce(s).";
	}

	/**
	 * M&eacute;thode egalA pour la classe <b>Toutou</b> pour comparer deux chiens
	 * Ils sont &eacute;gaux si tous leurs attributs sont &eacute;gaux.
	 * @param t le chien &egrave; comparer
	 * @return si les chiens sont &eacute;gaux
	 */
	public boolean egalA(Toutou t){
		return nom.equals(t.nom) && robe == t.robe && nbPuces == t.nbPuces;
	}
}

