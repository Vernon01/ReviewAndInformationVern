package za.ac.cput.CorrectOCP;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/25.
 */
public class AbsOCPTEST {

    AddAbsOCP c = new AddAbsOCP();
    SubAbsOCP d = new SubAbsOCP();

    @Test
    public void testAdd()throws Exception
    {
        Assert.assertEquals(110,c.calc());
    }

    @Test
    public void testSub()throws Exception
    {
        Assert.assertEquals(11,d.calc());
    }
}
