package za.ac.cput;

/**
 * Created by student on 2015/03/09.
 */
public class gym {

    private String warmUp;
    private String lift;
    private String coolDown;

    public String getWarmUp()
    {
        return warmUp;
    }

    public void setWarmUp(String warmUp)
    {
        this.warmUp = warmUp;
    }

    public String getlift()
    {
        return lift;
    }

    public void setlift(String lift)
    {
        this.lift = lift;
    }

    public String getCoolDown()
    {
        return coolDown;
    }

    public void setCoolDown(String coolDown)
    {
        this.coolDown = coolDown;
    }

    public String toString()
    {
        return "Warming up: " + warmUp + ", Lift weights: " + lift + ", Cooling Down: " + coolDown;
    }
}
