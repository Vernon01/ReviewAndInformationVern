package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class CommandTest {

    Guy1 bd1 = new Guy1();
    Workout bdyBuilder = new bodyBuilder(bd1);

    @Test
    public void testCommand() throws Exception
    {
        Assert.assertEquals(10,bdyBuilder.NumLifts());
    }
}
