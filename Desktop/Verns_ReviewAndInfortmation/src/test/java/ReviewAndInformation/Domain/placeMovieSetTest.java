package ReviewAndInformation.Domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/18.
 */
public class placeMovieSetTest {

    @Test
    public void testPlaceMovieSet() throws Exception {
        placeMovieSet plms = new placeMovieSet.Builder("France").build();
        Assert.assertEquals("France", plms.getCityDirectedIn());
    }
}
