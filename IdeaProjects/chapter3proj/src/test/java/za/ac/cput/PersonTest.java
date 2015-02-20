package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Config.AppConfig;

/**
 * Created by student on 2015/02/19.
 */
public class PersonTest {

    private Person per;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        per = (Person)ctx.getBean("personApp");

    }
    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testName() throws Exception {

        Assert.assertEquals("Vernon", per.name("Vernon"));
    }

    @Test
    public void testAge1() throws Exception {

        Assert.assertEquals(23, per.age1(2015, 1992));
    }
}
