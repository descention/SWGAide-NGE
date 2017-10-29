package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGAmorphousGemstone;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Plexite Amorphous Gemstone"
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
public final class SWGPlexiteAmorphousGemstone extends SWGAmorphousGemstone {

  private static final long serialVersionUID = 1138620L;

  private static final int[] minStats = {0, 271, 271, 217, 0, 708, 163, 1, 0, 271, 271};
  private static final int[] maxStats = {0, 431, 431, 345, 0, 772, 259, 1000, 0, 431, 431};

  private static final SWGPlexiteAmorphousGemstone INSTANCE = new SWGPlexiteAmorphousGemstone();

  SWGPlexiteAmorphousGemstone() { super(); }

  public static SWGPlexiteAmorphousGemstone getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 750; }
  public int rcID() { return 143; }
  public String rcName() { return "Plexite Amorphous Gemstone";}
  public String rcToken() { return "plamo";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
