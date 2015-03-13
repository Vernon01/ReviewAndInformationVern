package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class bodyBuilder implements Workout {

    Guy1 guy;

    public bodyBuilder(Guy1 guy)
    {
        this.guy = guy;
    }

    @Override
    public int NumLifts()
    {
        return guy.lifting();
    }
}
