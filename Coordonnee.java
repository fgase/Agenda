

/**
 * Class Coordonnee
 */
public class Coordonnee {

  //
  // Fields
  //

  private String latitude;
  private String longitude;
  
  //
  // Constructors
  //
  public Coordonnee () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of latitude
   * @param newVar the new value of latitude
   */
  private void setLatitude ( String newVar ) {
    latitude = newVar;
  }

  /**
   * Get the value of latitude
   * @return the value of latitude
   */
  private String getLatitude ( ) {
    return latitude;
  }

  /**
   * Set the value of longitude
   * @param newVar the new value of longitude
   */
  private void setLongitude ( String newVar ) {
    longitude = newVar;
  }

  /**
   * Get the value of longitude
   * @return the value of longitude
   */
  private String getLongitude ( ) {
    return longitude;
  }

  //
  // Other methods
  //

}
