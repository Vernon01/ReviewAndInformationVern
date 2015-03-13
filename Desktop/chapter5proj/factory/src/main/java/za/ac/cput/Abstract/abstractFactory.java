package za.ac.cput.Abstract;

/**
 * Created by student on 2015/03/09.
 */
public class abstractFactory {

    public speedFactory getSpeedFactory(String make)
    {
        if("honda".equals(make))
        {
            return new speedCRX();
        }else
        {
            return new speed86Toyo();
        }
    }
}
