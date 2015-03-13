package za.ac.cput.Abstract;

import za.ac.cput.car;
import za.ac.cput.honda;
import za.ac.cput.toyota;

/**
 * Created by student on 2015/03/09.
 */
public class speedCRX extends speedFactory {

    @Override
    public car getCar(String make)
    {
        if("honda".equals(make))
        {
            return new honda();
        }else
        {
            return new toyota();
        }
    }
}
