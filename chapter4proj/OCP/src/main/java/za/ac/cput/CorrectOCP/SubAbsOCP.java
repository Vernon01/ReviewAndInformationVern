package za.ac.cput.CorrectOCP;

/**
 * Created by student on 2015/02/25.
 */
public class SubAbsOCP extends AbsOCP {

    private int a = 34;
    private int b = 23;

    @Override
    public int calc()
    {
        return a-b;
    }
}
