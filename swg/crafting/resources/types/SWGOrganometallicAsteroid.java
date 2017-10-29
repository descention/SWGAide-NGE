package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGAsteroidalGas;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Organometallic Asteroid"
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
public final class SWGOrganometallicAsteroid extends SWGAsteroidalGas {

  private static final long serialVersionUID = 6104216L;

  private static final int[] minStats = {0, 0, 0, 0, 0, 0, 0, 1000, 0, 0, 0};
  private static final int[] maxStats = {0, 0, 0, 0, 0, 0, 0, 1000, 0, 0, 0};

  private static final SWGOrganometallicAsteroid INSTANCE = new SWGOrganometallicAsteroid();

  SWGOrganometallicAsteroid() { super(); }

  public static SWGOrganometallicAsteroid getInstance() { return INSTANCE; }

  public int expectedStats() { return 1; }
  public int sortIndex() { return 807; }
  public int rcID() { return 771; }
  public String rcName() { return "Organometallic Asteroid";}
  public String rcToken() { return "aorm";}
  public boolean isSpaceOrRecycled()  { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
