package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class facadeTest {

    facade fcd = new facade();

    @Test
    public void testFacName() throws Exception
    {
        Assert.assertEquals("Viper",fcd.name("Viper"));
    }

    @Test
    public void testFacSurname() throws Exception
    {
        Assert.assertEquals("Viper Strikes",fcd.surname("Viper Strikes"));
    }
}
