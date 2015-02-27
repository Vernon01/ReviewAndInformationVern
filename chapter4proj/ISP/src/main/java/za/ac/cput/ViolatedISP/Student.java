package za.ac.cput.ViolatedISP;

/**
 * Created by student on 2015/02/25.
 */
public class Student implements StudInfoIntf {

    @Override
    public String studentName()
    {
        String na = "canola";
        return na;
    }

    @Override
    public int studentAge()
    {
        int agi = 21;
        return agi;
    }

    @Override
    public int studentNumber()
    {
        int stuN = 447382630;
        return stuN;
    }
}
