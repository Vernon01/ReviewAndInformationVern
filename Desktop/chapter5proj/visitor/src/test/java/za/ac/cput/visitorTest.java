package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class visitorTest {

    RacerEl1 el1 = new RacerEl1(30);
    Racer racer1 = new Racer1();

    @Test
    public void testVisitor() throws Exception
    {
        Assert.assertEquals(30,el1.timesRaced(racer1));
    }

}
