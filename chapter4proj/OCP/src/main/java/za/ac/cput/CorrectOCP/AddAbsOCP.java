package za.ac.cput.CorrectOCP;

/**
 * Created by student on 2015/02/25.
 */
public class AddAbsOCP extends AbsOCP {

    private int a = 50;
    private int b = 60;


    @Override
    public int calc()
    {
        return a+b;
    }
}
