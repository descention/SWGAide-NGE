package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGCopper;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Thallium Copper"
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
public final class SWGThalliumCopper extends SWGCopper {

  private static final long serialVersionUID = 2427461L;

  private static final int[] minStats = {539, 63, 55, 0, 0, 235, 539, 1, 0, 339, 339};
  private static final int[] maxStats = {628, 205, 180, 0, 0, 315, 628, 1000, 0, 428, 428};

  private static final SWGThalliumCopper INSTANCE = new SWGThalliumCopper();

  SWGThalliumCopper() { super(); }

  public static SWGThalliumCopper getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 685; }
  public int rcID() { return 306; }
  public String rcName() { return "Thallium Copper";}
  public String rcToken() { return "thcpr";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
