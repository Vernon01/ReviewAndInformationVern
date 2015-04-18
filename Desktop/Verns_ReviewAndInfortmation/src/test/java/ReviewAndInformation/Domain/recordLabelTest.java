package ReviewAndInformation.Domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/18.
 */
public class recordLabelTest {

    @Test
    public void testRecordLabel() throws Exception {
        recordLabel rl = new recordLabel.Builder("Shady Records").build();
        Assert.assertEquals("Shady Records", rl.getLabel());
    }
}
