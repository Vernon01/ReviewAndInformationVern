package ReviewAndInformation.Domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/18.
 */
public class singerTest {

    @Test
    public void testSinger() throws Exception {
        singer si = new singer.Builder("keysha").build();
        Assert.assertEquals("keysha", si.getSinging());
    }
}
