package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGBone;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Ground Bones"
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
public final class SWGGroundBones extends SWGBone {

  private static final long serialVersionUID = 6404682L;

  private static final int[] minStats = {0, 0, 200, 0, 0, 0, 200, 200, 0, 200, 200};
  private static final int[] maxStats = {0, 0, 200, 0, 0, 0, 200, 200, 0, 200, 200};

  private static final SWGGroundBones INSTANCE = new SWGGroundBones();

  SWGGroundBones() { super(); }

  public static SWGGroundBones getInstance() { return INSTANCE; }

  public int expectedStats() { return 5; }
  public int sortIndex() { return 224; }
  public int rcID() { return 809; }
  public String rcName() { return "Ground Bones";}
  public String rcToken() { return "gbne";}
  public boolean isSpaceOrRecycled()  { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
