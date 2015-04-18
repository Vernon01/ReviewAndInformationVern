package ReviewAndInformation.Domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/18.
 */
public class movieTest {

    @Test
    public void testMovie() throws Exception {
        movie mv = new movie.Builder("awesome").category("DL").length(90).build();
        Assert.assertEquals("awesome", mv.getName());
    }
}
