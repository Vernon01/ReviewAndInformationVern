package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class LiftInvoker {

    Workout wrk1;

    public LiftInvoker(Workout wrk1)
    {
        this.wrk1 = wrk1;
    }

    public int invoke()
    {
        return wrk1.NumLifts();
    }
}
