package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */
public class CompositeTest {

    motorBike bike1 = new motorBike("bike noise");
    motorBike bike2 = new motorBike("no noise");

    Composite compr = new Composite();

    @Test
    public void testComp() throws Exception
    {
        compr.add(bike1);
        compr.add(bike2);
        Assert.assertEquals("motorbike starts engine", bike1.startEngine());
        Assert.assertEquals("motorbike switches off engine",bike2.stopEngine());
    }
}
