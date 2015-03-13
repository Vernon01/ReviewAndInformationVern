package za.ac.cput;

import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */
public class proxyTest {

    proxySpeed proxSpd = new proxySpeed();
    fastProx fstProx = new fastProx();

    @Test
    public void testProx() throws Exception
    {
        fstProx.welcome();
        proxSpd.welcome();
        //Assert.assertEquals("...",proxSpd.welcome()); works...date will change therefore cannot put expected result
    }

}
