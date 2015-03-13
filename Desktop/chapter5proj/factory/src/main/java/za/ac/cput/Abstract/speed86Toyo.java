package za.ac.cput.Abstract;

import za.ac.cput.car;
import za.ac.cput.honda;
import za.ac.cput.toyota;

/**
 * Created by student on 2015/03/09.
 */
public class speed86Toyo extends speedFactory {

    @Override
    public car getCar(String make)
    {
        if("toyota".equals(make))
        {
            return new toyota();
        }else
        {
            return new honda();
        }
    }
}
