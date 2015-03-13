package za.ac.cput;

/**
 * Created by student on 2015/03/10.
 */
public abstract class Person {

    Gym gym;
    int weightGain;

    public abstract String workout();

    public void setGym(Gym gym)
    {
        this.gym = gym;
    }

    public String progress(String prog)
    {
        return prog;
    }
}
