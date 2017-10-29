package swg.crafting.resources.types;

import swg.crafting.resources.SWGResourceClass;
import swg.crafting.resources.types.SWGMeat;
import swg.crafting.Stat;

/*
 * Represents a resource class of type "Herbivore Meat"
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
public class SWGHerbivoreMeat extends SWGMeat {

  private static final long serialVersionUID = 1407458L;

  private static final int[] minStats = {0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0};
  private static final int[] maxStats = {0, 0, 1000, 0, 700, 0, 0, 1000, 700, 0, 0};

  private static final SWGHerbivoreMeat INSTANCE = new SWGHerbivoreMeat();

  SWGHerbivoreMeat() { super(); }

  public static SWGHerbivoreMeat getInstance() { return INSTANCE; }

  public int expectedStats() { return 4; }
  public int sortIndex() { return 103; }
  public int rcID() { return 177; }
  public String rcName() { return "Herbivore Meat";}
  public String rcToken() { return "hmt";}
  public boolean has(Stat s) { return minStats[s.i] > 0; }
  public int max(Stat s) { return maxStats[s.i]; }
  public int min(Stat s) { return minStats[s.i]; }

  private Object readResolve() {
    return INSTANCE; // preserve singleton property
  }
}
