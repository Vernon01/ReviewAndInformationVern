package za.ac.cput.ViolatedLSPTest;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.ViolatedLSP.AnimalViolation;
import za.ac.cput.ViolatedLSP.DogViol;
import za.ac.cput.ViolatedLSP.FishViol;

/**
 * Created by student on 2015/02/26.
 */
public class LSPTestViol {

    AnimalViolation doggy1 = new DogViol();
    AnimalViolation fishy = new FishViol();

    @Test
    public void testMethodsDog()
    {
        Assert.assertEquals("walking", doggy1.walk());
        Assert.assertEquals("running",doggy1.run());
        Assert.assertEquals("eating",doggy1.eats());
    }

    @Test
    public void testMethodsFish()
    {
        Assert.assertEquals("walking",fishy.walk()); //violate
        Assert.assertEquals("running",fishy.run());  //violate
        Assert.assertEquals("eating",fishy.eats());
    }

}
