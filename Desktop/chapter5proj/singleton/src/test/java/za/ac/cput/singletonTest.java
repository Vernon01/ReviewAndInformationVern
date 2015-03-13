package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */
public class singletonTest {

    singletonClass singletoninstance = singletonClass.getInstance();
    @Test
    public void testsingle()throws Exception
    {
        Assert.assertEquals("singleton example works",singletoninstance.singletoncheck());
    }
}
