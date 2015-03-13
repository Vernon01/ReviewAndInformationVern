package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class ObserverTest {

    CarCentre cc1 = new CarCentre(10);
    Driver driver1 = new Driver();

    @Test
    public void testObserver() throws Exception
    {
        Assert.assertEquals(10,cc1.setSpeed());
    }
}
