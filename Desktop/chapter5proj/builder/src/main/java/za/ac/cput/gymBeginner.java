package za.ac.cput;

/**
 * Created by student on 2015/03/09.
 */
public class gymBeginner implements gymBuilder {

    private gym gym1;

    public gymBeginner()
    {
        gym1 = new gym();
    }

    @Override
    public void buildWarmUp()
    {
        gym1.setWarmUp("run");
    }

    @Override
    public void buildLift()
    {
        gym1.setlift("light weights");
    }

    @Override
    public void buildCoolDown()
    {
        gym1.setCoolDown("stretch");
    }

    @Override
    public gym getGym()
    {
        return gym1;
    }
}
