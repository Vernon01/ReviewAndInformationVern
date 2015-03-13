package za.ac.cput;

import java.util.Date;

/**
 * Created by student on 2015/03/09.
 */
public class proxySpeed {

    slowProx slwprx;

    public proxySpeed()
    {
        System.out.println("create proxy: " + new Date());
    }

    public String welcome()
    {
        if (slwprx == null)
        {
             slwprx = new slowProx();
        }
        return slwprx.welcome();
    }

}
