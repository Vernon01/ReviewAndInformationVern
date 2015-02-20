package za.ac.cput;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    private List arrList;

    public Object iList()
    {
        arrList = new ArrayList();
        arrList.add("annie");
        arrList.add("pennie");
        arrList.add("flanie");
        arrList.add("cammie");

        arrList.remove("flannie");

        return arrList.get(3);
    }
}
