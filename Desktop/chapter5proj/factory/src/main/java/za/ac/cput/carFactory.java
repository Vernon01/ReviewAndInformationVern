package za.ac.cput;

/**
 * Created by student on 2015/03/09.
 */
public class carFactory {

    public car getCar(String make)
    {
        if ("fast".equals(make))
        {
            return new honda();
        }
        else
        {
            return new toyota();
        }
    }
}
