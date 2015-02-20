package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/18.
 */
public class mapTest {

    map maap = new map();

    @Test
    public void testMap1() throws Exception
    {
        Assert.assertEquals("favorite",maap.map1());
    }
}
