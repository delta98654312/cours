/**
  * Interface <b>IPoint</b> qui doit &ecirc;tre impl&eacute;ment&eacute;e
  * par les classes <b>PointCartesien</b> et <b>PointPolaire</b>
  * @author Jessica Jonquet
  * @version 06/03/2025
  */
public interface IPoint {

    /**
      * Retourne la coordonnée x du point
      * @return la coordonnée x du point
      */
    public double getX();

    /**
      * Retourne la coordonnée y du point
      * @return la coordonnée y du point
      */
    public double getY();

    /**
      * Calcule la distance entre l'origine et le point
      * @return la distance entre l'origine et le point
      */
    public double distance();

    /**
      * Calcule la distance entre le point courant et le point passé en paramètre
      * @param p le point avec lequel on calcule la distance
      * @return la distance entre le point courant et le point passé en paramètre
      */
    public double distance(IPoint p);

    /**
      * Permet d'afficher le point &agrave; l'&eacute;cran
      */
    public void afficher();

}
