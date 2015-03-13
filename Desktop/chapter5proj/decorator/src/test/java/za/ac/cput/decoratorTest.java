package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class decoratorTest {

    Car carrie = new workingCar();
    Car br = new BodyColor(carrie);

    @Test
    public void testCar() throws Exception
    {

        Assert.assertEquals("Honda",carrie.make());
        Assert.assertEquals("red",br.make());
    }
}
