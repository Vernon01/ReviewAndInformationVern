package za.ac.cput.ViolatedPLKTest;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.ViolatedPLK.EngineerBuild;

/**
 * Created by student on 2015/02/27.
 */
public class EngineerTest {

    EngineerBuild eb = new EngineerBuild();

    @Test
    public void testBuild() throws Exception
    {
        Assert.assertEquals("practical",eb.EngBuild());
    }
}
