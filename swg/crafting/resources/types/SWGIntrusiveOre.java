package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGIgneousOre;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Intrusive Ore"
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
public class SWGIntrusiveOre extends SWGIgneousOre {

  private static final long serialVersionUID = 1241411L;

  private static final int[] minStats = {0, 200, 300, 0, 0, 700, 1, 1, 0, 500, 400};
  private static final int[] maxStats = {0, 1000, 1000, 0, 0, 1000, 600, 1000, 0, 1000, 1000};

  private static final SWGIntrusiveOre INSTANCE = new SWGIntrusiveOre();

  SWGIntrusiveOre() { super(); }

  public static SWGIntrusiveOre getInstance() { return INSTANCE; }

  public int expectedStats() { return 7; }
  public int sortIndex() { return 711; }
  public int rcID() { return 156; }
  public String rcName() { return "Intrusive Ore";}
  public String rcToken() { return "int";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
