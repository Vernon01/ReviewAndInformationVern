package za.ac.cput;

/**
 * Created by student on 2015/03/09.
 */
public class slowProx extends prox {

    public slowProx()
    {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
