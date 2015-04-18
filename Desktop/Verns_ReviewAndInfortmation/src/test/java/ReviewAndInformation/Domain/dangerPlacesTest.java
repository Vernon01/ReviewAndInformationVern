package ReviewAndInformation.Domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/18.
 */
public class dangerPlacesTest {

    @Test
    public void testDangerPlaces() throws Exception {
        dangerPlaces dp = new dangerPlaces.Builder("khayalitsa").build();
        Assert.assertEquals("khayalitsa", dp.getAvoidedPlaces());
    }
}
