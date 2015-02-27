package za.ac.cput.ViolatedOCP;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/25.
 */
public class ViolateOCPTEST {

    ViolateOCP oc = new ViolateOCP();

    @Test
    public void testViolation() throws Exception
    {
        Assert.assertEquals(99,oc.add());
        Assert.assertEquals(16,oc.subtract());
    }
}
