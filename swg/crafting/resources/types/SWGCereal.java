package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGFloraFood;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Cereal"
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
public class SWGCereal extends SWGFloraFood {

  private static final long serialVersionUID = 751177L;

  private static final int[] minStats = {0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 1000, 0, 1000, 0, 0, 1000, 1000, 0, 0};

  private static final SWGCereal INSTANCE = new SWGCereal();

  SWGCereal() { super(); }

  public static SWGCereal getInstance() { return INSTANCE; }

  public int expectedStats() { return 4; }
  public int sortIndex() { return 320; }
  public int rcID() { return 94; }
  public String rcName() { return "Cereal";}
  public String rcToken() { return "cer";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
