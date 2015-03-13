package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class bridgeTest {

    Person p = new SmallPerson(new GymHome());
    Person p1 = new BigPerson(new GymClub());

    @Test
    public void testSmallPerson() throws Exception
    {
        p.setGym(new GymHome());
        Assert.assertEquals("slow",p.progress("slow"));
    }

    @Test
    public void testBigPerson() throws Exception
    {
        p1.setGym(new GymClub());
        Assert.assertEquals("fast",p1.progress("fast"));
    }

}
