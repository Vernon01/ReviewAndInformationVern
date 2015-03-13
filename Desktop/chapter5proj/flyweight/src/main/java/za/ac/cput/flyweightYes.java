package za.ac.cput;

/**
 * Created by student on 2015/03/10.
 */
public class flyweightYes implements flyweight {

    String ops;

    public flyweightYes() {
        ops = "Yes!";


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String output(String a)
    {
        return a;
    }
}
