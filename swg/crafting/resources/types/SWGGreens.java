package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGVegetables;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Greens"
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
public class SWGGreens extends SWGVegetables {

  private static final long serialVersionUID = 3265603L;

  private static final int[] minStats = {0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 1000, 0, 1000, 0, 0, 1000, 1000, 0, 0};

  private static final SWGGreens INSTANCE = new SWGGreens();

  SWGGreens() { super(); }

  public static SWGGreens getInstance() { return INSTANCE; }

  public int expectedStats() { return 4; }
  public int sortIndex() { return 433; }
  public int rcID() { return 412; }
  public String rcName() { return "Greens";}
  public String rcToken() { return "grn";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
