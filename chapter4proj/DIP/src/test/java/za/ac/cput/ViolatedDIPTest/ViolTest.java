package za.ac.cput.ViolatedDIPTest;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.ViolatedDIP.Subface;
import za.ac.cput.ViolatedDIP.addingface;

/**
 * Created by student on 2015/02/27.
 */
public class ViolTest {
    addingface af = new addingface();
    Subface sf = new Subface();

    @Test
    public void testAdd() throws Exception
    {
        Assert.assertEquals(80,af.calcing());
    }

    @Test
    public void testSub() throws Exception
    {
        Assert.assertEquals(11,sf.calcing());
    }
}
