package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class PersonTest {

    Person p1 = new Pclass1();

    Person p2 = new Pclass2();


    @Test
    public void testPersonClass1() throws Exception
    {
        Assert.assertEquals("walk around. Yes i workout and its sleep time",p1.doPerson());
    }

    @Test
    public void testPersonClass2() throws Exception
    {
        Assert.assertEquals("running around. No i dont workout and its not sleep time yet",p2.doPerson());
    }
}
