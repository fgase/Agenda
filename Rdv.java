
import java.util.*;


/**
 * Class Rdv
 */
public class Rdv {

  //
  // Fields
  //

  private Lieu lieu;
  private Date date;
  private Trajet trajet;
  
  //
  // Constructors
  //
  public Rdv () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of lieu
   * @param newVar the new value of lieu
   */
  private void setLieu ( Lieu newVar ) {
    lieu = newVar;
  }

  /**
   * Get the value of lieu
   * @return the value of lieu
   */
  private Lieu getLieu ( ) {
    return lieu;
  }

  /**
   * Set the value of date
   * @param newVar the new value of date
   */
  private void setDate ( Date newVar ) {
    date = newVar;
  }

  /**
   * Get the value of date
   * @return the value of date
   */
  private Date getDate ( ) {
    return date;
  }

  /**
   * Set the value of trajet
   * @param newVar the new value of trajet
   */
  private void setTrajet ( Trajet newVar ) {
    trajet = newVar;
  }

  /**
   * Get the value of trajet
   * @return the value of trajet
   */
  private Trajet getTrajet ( ) {
    return trajet;
  }

  //
  // Other methods
  //

}
