package ReviewAndInformation.Domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/18.
 */
public class musicTypeTest {

    @Test
    public void testMusicType() throws Exception {
        musicType mt = new musicType.Builder("linkin park").build();
        Assert.assertEquals("linkin park", mt.getRock());
    }
}
