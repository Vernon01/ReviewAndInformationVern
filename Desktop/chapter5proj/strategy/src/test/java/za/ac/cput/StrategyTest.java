package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class StrategyTest {

    Car bmwengine = new BmwEngine();
    EngineCheck engSize = new EngineCheck("big",bmwengine);

    Car hondaengine = new HondaEngine();
    EngineCheck enSize = new EngineCheck("small",hondaengine);

    @Test
    public void testBMW() throws Exception
    {
        Assert.assertEquals("big",engSize.getType());
    }

    @Test
    public void testHonda() throws Exception
    {
        Assert.assertEquals("small",enSize.getType());
    }
}
