/**
* Interface <b>IComplexe</b> qui doit être implémentée par la classe <b>Complexe</b>.
* @author Jessica Jonquet
* @version 06/03/2025
*/
public interface IComplexe {
	/**
	* Retourne la partie réelle du nombre complexe.
	* @return la partie réelle
	*/
	public double getPartieReelle();

	/**
	* Retourne la partie imaginaire du nombre complexe.
	* @return la partie imaginaire
	*/
	public double getPartieImaginaire();

	/**
	* Modifie la partie réelle du nombre complexe.
	* @param partieReelle la nouvelle partie réelle
	*/
	public void setPartieReelle(double partieReelle);

	/**
	* Modifie la partie imaginaire du nombre complexe.
	* @param partieImaginaire la nouvelle partie imaginaire
	*/
	public void setPartieImaginaire(double partieImaginaire);

	/**
	* Modifie les parties réelle et imaginaire du nombre complexe.
	* @param partieReelle la nouvelle partie réelle
	* @param partieImaginaire la nouvelle partie imaginaire
	*/
	public void changerValeur(double partieReelle, double partieImaginaire);

	/**
	* Teste l'égalité avec le nombre complexe passé en paramètre.
	* @param c le nombre complexe
	* @return 'true' si les deux nombres complexes sont égaux
	*/
	public boolean egalA(IComplexe c);

	/**
	* Additionne la partie reelle au nombre complexe courant
	* @param reel la partie reelle
	*/
	public void additionner(double reel);

	/**
	* Additionne ajoute la partie reelle et la partie imaginaire au complexe courant (resp. à sa partie réelle et à sa partie imaginaire).
	* @param reel la partie reelle
	* @param imaginaire la partie imaginaire
	*/
	public void additionner(double reel, double imaginaire);

	/**
	* Additionne un nombre complexe passé au parametre au nombre complexe courant
	* @param r le nombre complexe
	*/
	public void additionner(IComplexe r);
}
