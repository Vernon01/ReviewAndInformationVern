package za.ac.cput.ViolatedADPTest;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.VioldatedADP.Bdependant;

/**
 * Created by student on 2015/02/27.
 */
public class ViolatedTest {

    Bdependant bd = new Bdependant();

    @Test
    public void testNumbers() throws Exception
    {
        Assert.assertEquals(90,bd.numbers());
    }
}
