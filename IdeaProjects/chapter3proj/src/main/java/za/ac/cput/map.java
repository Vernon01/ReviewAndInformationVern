package za.ac.cput;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/18.
 */
public class map {
    private Map layout;

    public String map1()
    {
        layout = new HashMap();

        layout.put("girl1","notInterested");
        layout.put("girl2","favorite");

        String clas = (String) layout.get("girl2");

        return clas;
    }
}
