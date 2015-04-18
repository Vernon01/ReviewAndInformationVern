package ReviewAndInformation.Domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/18.
 */
public class producerTest {

    @Test
    public void testProducer() throws Exception {
        producer pr = new producer.Builder("peter").age(23).yearsProducing(4).build();
        Assert.assertEquals("peter", pr.getName());
    }
}
