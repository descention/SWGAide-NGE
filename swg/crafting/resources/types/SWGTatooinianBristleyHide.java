package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGBristleyHide;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Tatooinian Bristley Hide"
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
public final class SWGTatooinianBristleyHide extends SWGBristleyHide {

  private static final long serialVersionUID = 1526063L;

  private static final int[] minStats = {0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1};
  private static final int[] maxStats = {0, 0, 1000, 0, 0, 0, 1000, 1000, 0, 1000, 1000};

  private static final SWGTatooinianBristleyHide INSTANCE = new SWGTatooinianBristleyHide();

  SWGTatooinianBristleyHide() { super(); }

  public static SWGTatooinianBristleyHide getInstance() { return INSTANCE; }

  public int expectedStats() { return 5; }
  public int sortIndex() { return 288; }
  public int rcID() { return 192; }
  public String rcName() { return "Tatooinian Bristley Hide";}
  public String rcToken() { return "tabhd";}
  public boolean isHarvested() { return true; }
  public boolean isSpawnable() { return true; }
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
