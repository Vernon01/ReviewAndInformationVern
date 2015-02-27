package za.ac.cput.ViolatedLSP;

/**
 * Created by student on 2015/02/26.
 */
public class FishViol extends AnimalViolation{

    public String walk() //fish cant walk (violation)
    {
        return "walking";
    }

    public String run() //fish cant run (violation)
    {
        return "running";
    }

    public String eats()
    {
        return "eating";
    }
}
