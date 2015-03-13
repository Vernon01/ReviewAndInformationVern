package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */
public class gymBuildTest {

    gymBuilder gymStarter = new gymBeginner();
    gymBuilder gymPro = new gymExpert();

    gymDirector gymDir1 = new gymDirector(gymStarter);
    gymDirector gymDir2 = new gymDirector(gymPro);


    @Test
    public void testGym() throws Exception
    {
        gymDir1.constructBody();
        gym gymGuy1 = gymDir1.getGym();
        Assert.assertEquals("Warming up: run, Lift weights: light weights, Cooling Down: stretch",gymGuy1.toString());

        gymDir2.constructBody();
        gym gymGuy2 = gymDir2.getGym();
        Assert.assertEquals("Warming up: Start lift light weights, Lift weights: ifts heavy weights, Cooling Down: Stretch and does lighter weights",gymGuy2.toString());
    }
}
