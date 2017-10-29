package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGSolidPetrochemFuel;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Known Solid Petrochem Fuel"
 *
 * <b>WARNING:</b>
 * This class is generated by SWGResourceClassGenerator.
 * Do not manually modify this class as your changes are
 * erased when the classes are re-generated.
 *
 * @author Steven M. Doyle <shadow@triwizard.net>
 * @author <a href="mailto:simongronlund@gmail.com">Simon Gronlund</a>
 * aka Chimaera.Zimoon
 */
@SuppressWarnings("all")
public class SWGKnownSolidPetrochemFuel extends SWGSolidPetrochemFuel {

  private static final long serialVersionUID = 648386L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 0, 1, 300, 0, 0};
  private static final int[] maxStats = {0, 0, 800, 0, 0, 0, 0, 1000, 1000, 0, 0};

  private static final SWGKnownSolidPetrochemFuel INSTANCE = new SWGKnownSolidPetrochemFuel();

  SWGKnownSolidPetrochemFuel() { super(); }

  public static SWGKnownSolidPetrochemFuel getInstance() { return INSTANCE; }

  public int expectedStats() { return 3; }
  public int sortIndex() { return 617; }
  public int rcID() { return 81; }
  public String rcName() { return "Known Solid Petrochem Fuel";}
  public String rcToken() { return "ksp";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
