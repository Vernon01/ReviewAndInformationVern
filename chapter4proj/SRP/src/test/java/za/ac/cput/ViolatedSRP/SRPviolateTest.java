package za.ac.cput.ViolatedSRP;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/25.
 */
public class SRPviolateTest {

    SRPviolateClass1 sr = new SRPviolateClass1();

    @Test
    public void testName() throws Exception
    {
        Assert.assertEquals("valmi",sr.name());
    }

    @Test
    public void testSurname() throws Exception
    {
        Assert.assertEquals("carlo",sr.surname());
    }

    @Test
    public void testAge() throws Exception
    {
        Assert.assertEquals(98,sr.age());
    }

}
