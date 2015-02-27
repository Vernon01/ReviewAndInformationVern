package za.ac.cput.CorrectISP;

/**
 * Created by student on 2015/02/25.
 */
public class StudentInfo implements StudName, StudAge, StudNumber{

    @Override
    public String studentName()
    {
        String na = "alova";
        return na;
    }

    @Override
    public int studentAge()
    {
        int agi = 19;
        return agi;
    }

    @Override
    public int studentNumber()
    {
        int stuN = 231456787;
        return stuN;
    }

}
