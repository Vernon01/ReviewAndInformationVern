package za.ac.cput;

/**
 * Created by student on 2015/03/09.
 */
public class gymDirector {

    private gymBuilder gymBuild = null;

    public gymDirector(gymBuilder gymBuild)
    {
        this.gymBuild = gymBuild;
    }

    public void constructBody()
    {
        gymBuild.buildWarmUp();
        gymBuild.buildLift();
        gymBuild.buildCoolDown();
    }

    public gym getGym()
    {
        return gymBuild.getGym();
    }
}
