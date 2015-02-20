package za.ac.cput;


import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/18.
 */
public class setTest {

    set sd = new set();

    @Test
    public void testSet1() throws Exception
    {
        Assert.assertEquals(true, sd.iSet());
    }
}
