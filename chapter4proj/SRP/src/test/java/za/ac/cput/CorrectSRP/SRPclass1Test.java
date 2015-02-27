package za.ac.cput.CorrectSRP;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/24.
 */
public class SRPclass1Test {

    SRPclass1 spc = new SRPclass1();

    @Test
    public void testType() throws Exception
    {
        Assert.assertEquals("type",spc.type());
    }
}
