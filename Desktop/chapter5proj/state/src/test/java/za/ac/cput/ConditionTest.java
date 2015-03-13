package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class ConditionTest {

    Car cr = new Car(new BrokenCar());


    @Test
    public void testBrokenCar() throws Exception
    {
        Assert.assertEquals("Car is broken",cr.condition());
    }

    @Test
    public void testWorkingCar() throws Exception
    {
        cr.setCarCondition(new WorkingCar());
        Assert.assertEquals("Car is working",cr.condition());
    }
}
