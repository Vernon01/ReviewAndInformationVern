package za.ac.cput;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/02/18.
 */

public class set {

    public Set set1;

    public Object iSet()
    {
        set1 = new HashSet();
        set1.add("ad");
        set1.add("af");
        set1.add("av");

        return set1.contains("af");
    }
}
