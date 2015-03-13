package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class GymScheduleCaretaker {

    Object obj1;

    public void store(GymSchedule gym)
    {
        obj1 = gym.save();
    }

    public void restore(GymSchedule gym)
    {
        gym.restore(obj1);
    }
}
