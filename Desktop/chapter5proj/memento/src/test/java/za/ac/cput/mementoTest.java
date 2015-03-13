package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class mementoTest {

    GymScheduleCaretaker careTaker = new GymScheduleCaretaker();

    GymSchedule schedule = new GymSchedule(5,2);

    @Test
    public void testMemento() throws Exception
    {
        Assert.assertEquals("train days: 5 and off days: 2",schedule.toString());
    }
}
