package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGMineral;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Low-Grade Ore"
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
public class SWGLowGradeOre extends SWGMineral {

  private static final long serialVersionUID = 173966L;

  private static final int[] minStats = {0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
  private static final int[] maxStats = {0, 1000, 1000, 0, 0, 1000, 1000, 1000, 0, 1000, 1000};

  private static final SWGLowGradeOre INSTANCE = new SWGLowGradeOre();

  SWGLowGradeOre() { super(); }

  public static SWGLowGradeOre getInstance() { return INSTANCE; }

  public int expectedStats() { return 7; }
  public int sortIndex() { return 695; }
  public int rcID() { return 21; }
  public String rcName() { return "Low-Grade Ore";}
  public String rcToken() { return "lgo";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
