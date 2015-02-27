package za.ac.cput.CorrectLSPTest;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.CorrectLSP.Animal;
import za.ac.cput.CorrectLSP.Cat;
import za.ac.cput.CorrectLSP.Dog;

/**
 * Created by student on 2015/02/26.
 */
public class LSPTest {

    Animal doggy = new Dog();
    Animal catty = new Cat();

    @Test
    public void testMethodsDog()
    {
        Assert.assertEquals("walking",doggy.walk());
        Assert.assertEquals("running",doggy.run());
        Assert.assertEquals("eating",doggy.eats());
    }

    @Test
    public void testMethodsCat()
    {
        Assert.assertEquals("walking",catty.walk());
        Assert.assertEquals("running",catty.run());
        Assert.assertEquals("eating",catty.eats());
    }
}
