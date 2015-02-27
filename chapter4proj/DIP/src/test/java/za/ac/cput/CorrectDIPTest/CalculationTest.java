package za.ac.cput.CorrectDIPTest;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.CorrectDIP.Calculation;

/**
 * Created by student on 2015/02/26.
 */
public class CalculationTest {

    Calculation c = new Calculation();

    @Test
    public void testAdd() throws Exception
    {
        Assert.assertEquals(90,c.adding());
    }

    @Test
    public void testSubtract() throws Exception
    {
        Assert.assertEquals(75,c.subtracting());
    }
}
