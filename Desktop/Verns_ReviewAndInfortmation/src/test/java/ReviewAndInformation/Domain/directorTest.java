package ReviewAndInformation.Domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/18.
 */
public class directorTest {

    @Test
    public void testDirector() throws Exception {
        director dr = new director.Builder("darrick").age(23).yearsDirecting(12).build();
        Assert.assertEquals("darrick", dr.getName());
    }
}
