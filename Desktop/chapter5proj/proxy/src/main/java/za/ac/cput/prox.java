package za.ac.cput;

import java.util.Date;

/**
 * Created by student on 2015/03/09.
 */
public abstract class prox {

    public String welcome()
    {
        return (this.getClass().getSimpleName() + " Welcome" + new Date());
    }
}
