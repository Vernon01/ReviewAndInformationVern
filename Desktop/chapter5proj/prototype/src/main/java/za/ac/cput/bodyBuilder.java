package za.ac.cput;

/**
 * Created by student on 2015/03/09.
 */
public class bodyBuilder implements proto {

    String bodySize;

    public bodyBuilder (String bodySize)
    {
        this.bodySize = bodySize;
    }

    @Override
    public proto doClone()
    {
        return new bodyBuilder(bodySize);
    }

    public String toString()
    {
        return "That guy's body looks like a: " + bodySize;
    }
}
