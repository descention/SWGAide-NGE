package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGKnownRadioactive;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Class 5 Radioactive"
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
public final class SWGClass5Radioactive extends SWGKnownRadioactive {

  private static final long serialVersionUID = 1344202L;

  private static final int[] minStats = {0, 0, 611, 0, 0, 0, 0, 1, 764, 0, 0};
  private static final int[] maxStats = {0, 0, 703, 0, 0, 0, 0, 1000, 879, 0, 0};

  private static final SWGClass5Radioactive INSTANCE = new SWGClass5Radioactive();

  SWGClass5Radioactive() { super(); }

  public static SWGClass5Radioactive getInstance() { return INSTANCE; }

  public int expectedStats() { return 3; }
  public int sortIndex() { return 634; }
  public int rcID() { return 169; }
  public String rcName() { return "Class 5 Radioactive";}
  public String rcToken() { return "c5krd";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
