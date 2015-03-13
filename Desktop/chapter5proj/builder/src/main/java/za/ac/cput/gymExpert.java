package za.ac.cput;

/**
 * Created by student on 2015/03/09.
 */
public class gymExpert implements gymBuilder {

    private gym gym2;

    public gymExpert()
    {
        gym2 = new gym();
    }

    @Override
    public void buildWarmUp()
    {
        gym2.setWarmUp("Start lift light weights");
    }

    @Override
    public void buildLift()
    {
        gym2.setlift("ifts heavy weights");
    }

    @Override
    public void buildCoolDown()
    {
        gym2.setCoolDown("Stretch and does lighter weights");
    }

    @Override
    public gym getGym()
    {
        return gym2;
    }
}
