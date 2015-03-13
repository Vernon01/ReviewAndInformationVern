package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */
public class protoTest {

    car honda = new car("loud");
    bodyBuilder fitGuy = new bodyBuilder("Warrior");

    @Test
    public void testProto() throws Exception
    {
        Assert.assertEquals("That car sounds: loud",honda.toString());
        Assert.assertEquals("That guy's body looks like a: Warrior",fitGuy.toString());
    }
}
