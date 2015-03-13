package za.ac.cput;

/**
 * Created by student on 2015/03/09.
 */
public class singletonClass {

    private static singletonClass singletoninstance = null;

    private singletonClass()
    {
    }

    public static singletonClass getInstance()
    {
        if (singletoninstance == null)
        {
            singletoninstance = new singletonClass();
        }
        
        return singletoninstance;
    }

    public String singletoncheck()
    {
        return "singleton example works";
    }
}
