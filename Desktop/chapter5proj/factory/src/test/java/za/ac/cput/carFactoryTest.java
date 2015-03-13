package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */
public class carFactoryTest {

    carFactory carFac = new carFactory();

    car car1 = carFac.getCar("slow");
    car car2 = carFac.getCar("fast");

    @Test
    public void testCar() throws Exception
    {
        Assert.assertEquals("slow",car1.drive());
        Assert.assertEquals("fast",car2.drive());
    }
}
