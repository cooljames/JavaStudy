package study;

import java.util.*;

public final class Truck {

  /** Simple test harness.  */
  public static void main(String... aArgs){
    Truck planetKiller = new Truck();
    System.out.println(planetKiller);
  }

  /**
  * Intended only for debugging.
  *
  * <P>Here, the contents of every field are placed into the result, with
  * one field per line.
  */
  @Override public String toString() {
    StringBuilder result = new StringBuilder();
    String NEW_LINE = System.getProperty("line.separator");

    result.append(this.getClass().getName() + " Object {" + NEW_LINE);
    result.append(" Name: " + fName + NEW_LINE);
    result.append(" Number of doors: " + fNumDoors + NEW_LINE);
    result.append(" Year manufactured: " + fYearManufactured + NEW_LINE );
    result.append(" Color: " + fColor + NEW_LINE);
    //Note that Collections and Maps also override toString
    result.append(" Options: " + fOptions + NEW_LINE);
    result.append("}");

    return result.toString();
  }

  //..other methods elided
  
  // PRIVATE //

  private String fName = "Dodge";
  private int fNumDoors = 2;
  private Date fYearManufactured = new Date();
  private String fColor = "Fuchsia";
  private List<String> fOptions = Arrays.asList("Air Conditioning");
}