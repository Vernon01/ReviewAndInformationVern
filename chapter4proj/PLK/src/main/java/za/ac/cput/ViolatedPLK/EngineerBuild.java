package za.ac.cput.ViolatedPLK;

/**
 * Created by student on 2015/02/27.
 */
public class EngineerBuild {

    EngineerPrac ep = new EngineerPrac();


    public String EngBuild()   //violation is calling another object method from another
    {
        return ep.prac();

    }
}
