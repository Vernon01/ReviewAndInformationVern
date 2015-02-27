package za.ac.cput.ViolatedSRP;

/**
 * Created by student on 2015/02/25.
 */
public class SRPviolateClass1 implements SRPviolateInt {

    @Override
    public String name()
    {
        String nm = "valmi";
        return nm;
    }

    @Override
    public String surname()
    {
        String sur = "carlo";
        return sur;
    }

    @Override
    public int age()
    {
        int age1 = 98;
        return age1;
    }
}
