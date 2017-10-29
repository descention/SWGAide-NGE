package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGSteel;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Ditanium Steel"
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
public final class SWGDitaniumSteel extends SWGSteel {

  private static final long serialVersionUID = 2229786L;

  private static final int[] minStats = {371, 456, 785, 0, 0, 828, 228, 1, 0, 785, 742};
  private static final int[] maxStats = {475, 584, 865, 0, 0, 892, 292, 1000, 0, 865, 838};

  private static final SWGDitaniumSteel INSTANCE = new SWGDitaniumSteel();

  SWGDitaniumSteel() { super(); }

  public static SWGDitaniumSteel getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 651; }
  public int rcID() { return 281; }
  public String rcName() { return "Ditanium Steel";}
  public String rcToken() { return "dtstl";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
