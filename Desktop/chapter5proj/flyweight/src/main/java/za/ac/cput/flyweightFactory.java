package za.ac.cput;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/03/10.
 */
public class flyweightFactory {

    private static flyweightFactory flyFac;

    private Map<String, flyweight> flyweightMap;

    private flyweightFactory()
    {
        flyweightMap = new HashMap<String, flyweight>();
    }

    public static flyweightFactory getInstance()
    {
        if (flyFac == null)
        {
            flyFac = new flyweightFactory();
        }
        return flyFac;
    }

    public flyweight getFlyweight(String k)
    {
        if (flyweightMap.containsKey(k)) {
            return flyweightMap.get(k);
        } else {
            flyweight flyw;
            if ("Yes!".equals(k)) {
                flyw = new flyweightYes();
            } else {
                flyw = new flyweightNo();
            }
            flyweightMap.put(k, flyw);
            return flyw;
        }
    }
}
