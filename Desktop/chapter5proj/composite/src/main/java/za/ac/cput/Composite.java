package za.ac.cput;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/09.
 */
public class Composite implements Components {

    List<Components> comps = new ArrayList<Components>();

    @Override
    public String startEngine()
    {
        for (Components comp : comps)
        {
            comp.startEngine();
        }
        return startEngine();
    }

    @Override
    public String stopEngine()
    {
        for (Components comp:comps)
        {
             comp.stopEngine();
        }
        return stopEngine();
    }

    public void add(Components comp)
    {
        comps.add(comp);
    }

    public void remove(Components comp) {
        comps.remove(comp);
    }

    public List<Components> getComponents() {
        return comps;
    }

    public Components getComponent(int index) {
        return comps.get(index);
    }

}
