package ReviewAndInformation.Domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/18.
 */
public class GoToPlacesTest {

    @Test
    public void testGoToPlaces() throws Exception {
        GoToPlaces gtp = new GoToPlaces.Builder("CapeTown").build();
        Assert.assertEquals("CapeTown", gtp.getCityToVisit());
    }
}
