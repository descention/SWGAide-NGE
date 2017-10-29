package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGCrystallineGemstone;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Seafah Jewel Crystalline Gemstone"
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
public final class SWGSeafahJewelCrystallineGemstone extends SWGCrystallineGemstone {

  private static final long serialVersionUID = 1217690L;

  private static final int[] minStats = {0, 463, 463, 731, 0, 839, 186, 1, 0, 624, 624};
  private static final int[] maxStats = {0, 663, 663, 831, 0, 899, 265, 1000, 0, 764, 764};

  private static final SWGSeafahJewelCrystallineGemstone INSTANCE = new SWGSeafahJewelCrystallineGemstone();

  SWGSeafahJewelCrystallineGemstone() { super(); }

  public static SWGSeafahJewelCrystallineGemstone getInstance() { return INSTANCE; }

  public int expectedStats() { return 8; }
  public int sortIndex() { return 764; }
  public int rcID() { return 153; }
  public String rcName() { return "Seafah Jewel Crystalline Gemstone";}
  public String rcToken() { return "sjcry";}
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
