package za.ac.cput;

/**
 * Created by student on 2015/03/10.
 */
public class SmallPerson extends Person {

    public SmallPerson (Gym gym)
    {
        this.gym = gym;
        this.weightGain = 20;
    }

    @Override
    public String workout()
    {
        return gym.weights("light");
    }
}
