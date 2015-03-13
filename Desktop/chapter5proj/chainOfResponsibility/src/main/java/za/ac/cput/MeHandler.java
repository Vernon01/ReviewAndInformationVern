package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class MeHandler extends names {

    public String showNames(NameVals shw)
    {
        if (shw == NameVals.Me)
        {
            return "Me";
        }else
        {
            return "";
        }

    }
}
