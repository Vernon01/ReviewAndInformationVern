package za.ac.cput;

/**
 * Created by student on 2015/03/10.
 */
public abstract class Person {

    public final String doPerson()
    {
        String a = dothings();
        String b = workout();
        String c = sleep();

        return (a+b+c);
    }

    public abstract String dothings();
    public abstract String workout();
    public abstract String sleep();

}
