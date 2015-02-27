package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/23.
 */
public class StudentPolymorhpTest {

    Encapsulation m = new StudentPolymorph();

    @Test
    public void testAge() throws Exception
    {
        Assert.assertEquals(22,m.setAge(2015,1993));
    }
}
