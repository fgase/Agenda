
import java.util.*;


/**
 * Class Trajet
 */
public class Trajet {

  //
  // Fields
  //

  private Coordonnee depart;
  private Coordonnee arrivee;
  private int moyenne;
  
  //
  // Constructors
  //
  public Trajet () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of depart
   * @param newVar the new value of depart
   */
  private void setDepart ( Coordonnee newVar ) {
    depart = newVar;
  }

  /**
   * Get the value of depart
   * @return the value of depart
   */
  private Coordonnee getDepart ( ) {
    return depart;
  }

  /**
   * Set the value of arrivee
   * @param newVar the new value of arrivee
   */
  private void setArrivee ( Coordonnee newVar ) {
    arrivee = newVar;
  }

  /**
   * Get the value of arrivee
   * @return the value of arrivee
   */
  private Coordonnee getArrivee ( ) {
    return arrivee;
  }

  /**
   * Set the value of moyenne
   * @param newVar the new value of moyenne
   */
  private void setMoyenne ( int newVar ) {
    moyenne = newVar;
  }

  /**
   * Get the value of moyenne
   * @return the value of moyenne
   */
  private int getMoyenne ( ) {
    return moyenne;
  }

  //
  // Other methods
  //

}
