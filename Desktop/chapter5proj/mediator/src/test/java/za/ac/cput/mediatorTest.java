package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class mediatorTest {

    food food1 = new food();
    market fSeller = new foodSeller(food1);


    @Test
    public void testMediator() throws Exception
    {
        Assert.assertEquals(null, food1.fPrice);
    }
}
