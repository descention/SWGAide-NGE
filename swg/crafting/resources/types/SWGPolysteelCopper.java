package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGCopper;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Polysteel Copper"
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
public final class SWGPolysteelCopper extends SWGCopper {

  private static final long serialVersionUID = 2411647L;

  private static final int[] minStats = {928, 685, 599, 0, 0, 585, 928, 1, 0, 728, 728};
  private static final int[] maxStats = {1000, 800, 700, 0, 0, 650, 1000, 1000, 0, 800, 800};

  private static final SWGPolysteelCopper INSTANCE = new SWGPolysteelCopper();

  SWGPolysteelCopper() { super(); }

  public static SWGPolysteelCopper getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 692; }
  public int rcID() { return 304; }
  public String rcName() { return "Polysteel Copper";}
  public String rcToken() { return "pocpr";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
