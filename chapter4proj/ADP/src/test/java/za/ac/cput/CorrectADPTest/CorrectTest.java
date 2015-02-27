package za.ac.cput.CorrectADPTest;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.CorrectADP.A;
import za.ac.cput.CorrectADP.B;
import za.ac.cput.CorrectADP.C;

/**
 * Created by student on 2015/02/27.
 */
public class CorrectTest {

    A a = new A();
    B b = new B();
    C c = new C();

    @Test
    public void testAgent() throws Exception
    {
        Assert.assertEquals("lhaba",a.AgentName());
        Assert.assertEquals("noba",b.AgentSurname());
        Assert.assertEquals("short one",c.AgentHeight());
    }

}
