package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/19.
 */
public class AgeTest {
    private Age ag;

    @Before
    public void setUp() throws Exception {
        ag = new Ageimp();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAge1() throws Exception {

        Assert.assertEquals(23, ag.age1(2015, 1992));

    }
}
