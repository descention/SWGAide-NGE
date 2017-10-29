package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGBone;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Avian Bone"
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
public class SWGAvianBone extends SWGBone {

  private static final long serialVersionUID = 727456L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 1, 1, 0, 100, 1};
  private static final int[] maxStats = {0, 0, 700, 0, 0, 0, 600, 1000, 0, 500, 500};

  private static final SWGAvianBone INSTANCE = new SWGAvianBone();

  SWGAvianBone() { super(); }

  public static SWGAvianBone getInstance() { return INSTANCE; }

  public int expectedStats() { return 5; }
  public int sortIndex() { return 237; }
  public int rcID() { return 91; }
  public String rcName() { return "Avian Bone";}
  public String rcToken() { return "vbn";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
