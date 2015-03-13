package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class ChainTest {

    names chain = setUpChain();

    public static names setUpChain()
    {
        names let = new LetHandler();
        names me = new MeHandler();
        names go = new GoHandler();

        let.setNm(me);
        me.setNm(go);

        return let;
    }

    @Test
    public void testChain() throws Exception
    {
        Assert.assertEquals("Let",chain.showNames(NameVals.Let));
    }
}
