package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class flyweightTest {

    flyweightFactory flyFacs = flyweightFactory.getInstance();


    @Test
    public void testFlyweightYes() throws Exception
    {
        flyweight flyweightYes = flyFacs.getFlyweight("Yes!");
        Assert.assertEquals("Yes!",flyweightYes.output("Yes!"));
    }

    @Test
    public void testFlywieghtNo() throws Exception
    {
        flyweight flyweightNo = flyFacs.getFlyweight("No!");
        Assert.assertEquals("No!",flyweightNo.output("No!"));
    }
}
