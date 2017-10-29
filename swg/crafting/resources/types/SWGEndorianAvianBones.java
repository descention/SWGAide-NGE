package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGAvianBone;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Endorian Avian Bones"
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
public final class SWGEndorianAvianBones extends SWGAvianBone {

  private static final long serialVersionUID = 1881878L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 1, 1, 0, 100, 1};
  private static final int[] maxStats = {0, 0, 700, 0, 0, 0, 600, 1000, 0, 500, 500};

  private static final SWGEndorianAvianBones INSTANCE = new SWGEndorianAvianBones();

  SWGEndorianAvianBones() { super(); }

  public static SWGEndorianAvianBones getInstance() { return INSTANCE; }

  public int expectedStats() { return 5; }
  public int sortIndex() { return 241; }
  public int rcID() { return 237; }
  public String rcName() { return "Endorian Avian Bones";}
  public String rcToken() { return "envbn";}
  public boolean isHarvested() { return true; }
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
