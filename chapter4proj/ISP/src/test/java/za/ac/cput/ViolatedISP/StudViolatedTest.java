package za.ac.cput.ViolatedISP;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/25.
 */
public class StudViolatedTest {
    Student st = new Student();

    @Test
    public void testName() throws Exception
    {
        Assert.assertEquals("canola",st.studentName());
    }

    @Test
    public void testAge() throws Exception
    {
        Assert.assertEquals(21,st.studentAge());
    }

    @Test
    public void testNumber() throws Exception
    {
        Assert.assertEquals(447382630,st.studentNumber());
    }
}
