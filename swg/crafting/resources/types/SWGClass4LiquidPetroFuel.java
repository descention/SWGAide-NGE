package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGKnownLiquidPetrochemFuel;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Class 4 Liquid Petro Fuel"
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
public final class SWGClass4LiquidPetroFuel extends SWGKnownLiquidPetrochemFuel {

  private static final long serialVersionUID = 956759L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 600, 0, 0, 0, 0, 1000, 1000, 0, 0};

  private static final SWGClass4LiquidPetroFuel INSTANCE = new SWGClass4LiquidPetroFuel();

  SWGClass4LiquidPetroFuel() { super(); }

  public static SWGClass4LiquidPetroFuel getInstance() { return INSTANCE; }

  public int expectedStats() { return 3; }
  public int sortIndex() { return 577; }
  public int rcID() { return 120; }
  public String rcName() { return "Class 4 Liquid Petro Fuel";}
  public String rcToken() { return "c4kpf";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
