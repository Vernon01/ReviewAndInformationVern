package ReviewAndInformation.Domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/18.
 */
public class cityInfoTest {

    @Test
    public void testCityInfo() throws Exception {
        cityInfo ci = new cityInfo.Builder("Big city with lots of tourist places").build();
        Assert.assertEquals("Big city with lots of tourist places", ci.getCityInformation());
    }
}
