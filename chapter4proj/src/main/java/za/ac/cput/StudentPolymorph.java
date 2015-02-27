package za.ac.cput;

/**
 * Created by student on 2015/02/23.
 */
public class StudentPolymorph extends Encapsulation {

    private int currYear;
    private int bornYear;
    private int a = 0;


    public int setAge(int curr, int born)
    {
        a = curr - born;
        System.out.println("Age of the student is: " +a);
        return a;
    }

}
