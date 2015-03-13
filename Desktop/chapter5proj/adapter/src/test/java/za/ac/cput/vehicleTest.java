package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */
public class vehicleTest {

    vehicleObject vObj = new vehicleObject();

    @Test
    public void testCarWheels() throws Exception
    {
        vObj.setWheelsCar(4);
        Assert.assertEquals(4,vObj.carWheels(4));
    }

    @Test
    public void testTruckWheels() throws Exception
    {
        vObj.setWheelsTruck(18);
        Assert.assertEquals(18,vObj.truckWheels(18));
    }
}
