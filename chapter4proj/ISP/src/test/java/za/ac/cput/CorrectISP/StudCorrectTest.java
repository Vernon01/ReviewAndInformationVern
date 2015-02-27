package za.ac.cput.CorrectISP;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/25.
 */
public class StudCorrectTest {

    StudentInfo cm = new StudentInfo();

    @Test
    public void testName() throws Exception
    {
        Assert.assertEquals("alova",cm.studentName());
    }

    @Test
    public void testAge() throws Exception
    {
        Assert.assertEquals(19,cm.studentAge());
    }

    @Test
    public void testNumber() throws Exception
    {
        Assert.assertEquals(231456787,cm.studentNumber());
    }
}
