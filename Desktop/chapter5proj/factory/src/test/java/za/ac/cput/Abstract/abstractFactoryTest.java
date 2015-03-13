package za.ac.cput.Abstract;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.car;

/**
 * Created by student on 2015/03/09.
 */
public class abstractFactoryTest {

    abstractFactory absFac = new abstractFactory();

    speedFactory speedFac1 = absFac.getSpeedFactory("honda");
    speedFactory speedFac2 = absFac.getSpeedFactory("toyota");
    car c1 = speedFac1.getCar("honda");
    car c2 = speedFac2.getCar("toyota");

    @Test
    public void testAbstract() throws Exception
    {
        Assert.assertEquals("fast",c1.drive());
        Assert.assertEquals("slow",c2.drive());
    }
}
