package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGExtrusiveOre;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Keschel Extrusive Ore"
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
public final class SWGKeschelExtrusiveOre extends SWGExtrusiveOre {

  private static final long serialVersionUID = 2008390L;

  private static final int[] minStats = {0, 496, 559, 0, 0, 622, 223, 1, 0, 622, 622};
  private static final int[] maxStats = {0, 624, 671, 0, 0, 718, 318, 1000, 0, 718, 718};

  private static final SWGKeschelExtrusiveOre INSTANCE = new SWGKeschelExtrusiveOre();

  SWGKeschelExtrusiveOre() { super(); }

  public static SWGKeschelExtrusiveOre getInstance() { return INSTANCE; }

  public int expectedStats() { return 7; }
  public int sortIndex() { return 704; }
  public int rcID() { return 253; }
  public String rcName() { return "Keschel Extrusive Ore";}
  public String rcToken() { return "keext";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
