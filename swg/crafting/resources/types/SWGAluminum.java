package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGNonFerrousMetal;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Aluminum"
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
public class SWGAluminum extends SWGNonFerrousMetal {

  private static final long serialVersionUID = 1296760L;

  private static final int[] minStats = {1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
  private static final int[] maxStats = {800, 800, 800, 0, 0, 800, 1000, 1000, 0, 900, 900};

  private static final SWGAluminum INSTANCE = new SWGAluminum();

  SWGAluminum() { super(); }

  public static SWGAluminum getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 672; }
  public int rcID() { return 163; }
  public String rcName() { return "Aluminum";}
  public String rcToken() { return "alu";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
