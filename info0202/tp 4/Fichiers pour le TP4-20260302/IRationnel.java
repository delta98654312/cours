/**
* Interface <b>IRationnel</b> qui doit être implémentée par la classe <b>Rationnel</b>.
* @author Jessica Jonquet
* @version 06/03/2025
*/
public interface IRationnel {
	/**
	* Retourne le numérateur.
	* @return le numérateur
	*/
	public int getNumerateur();

	/**
	* Retourne le dénominateur.
	* @return le dénominateur
	*/
	public int getDenominateur();

	/**
	* Modifie le numérateur.
	* @param numerateur le nouveau numerateur
	*/
	public void setNumerateur(int numerateur);

	/**
	* Modifie le dénominateur.
	* @param denominateur le nouveau dénominateur
	*/
	public void setDenominateur(int denominateur);

	/**
	* Modifie le numérateur et le dénominateur.
	* @param numerateur le nouveau numérateur
	* @param denominateur le nouveau dénominateur
	*/
	public void changerValeur(int numerateur, int denominateur);

	/**
	* Teste l'égalité avec le nombre rationnel passé en paramètre.
	* @param r le nombre rationnel
	* @return 'true' si les deux nombres rationnels sont égaux
	*/
	public boolean egalA(IRationnel r);

	/**
	* Ajoute un nombre rationnel.
	* @param r le nombre rationnel
	*/
	public void ajouter(IRationnel r);

}
