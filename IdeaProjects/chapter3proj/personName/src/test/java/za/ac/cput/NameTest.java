package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.implement.NameImp;

/**
 * Created by student on 2015/02/19.
 */
public class NameTest {
    private Name nm;

    @Before
    public void setUp() throws Exception {
        nm = new NameImp();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testName() throws Exception {

        Assert.assertEquals("Vernon", nm.name("Vernon"));

    }
}
