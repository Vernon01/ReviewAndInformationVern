package za.ac.cput;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/03/13.
 */
public class CarCentre implements Cars {

    Set<CarDriver> cd;
    int speed;

    public CarCentre(int speed)
    {
        cd = new HashSet<CarDriver>();
        this.speed = speed;
    }

    @Override
    public String addCar(CarDriver cd)
    {
        return addCar(cd);
    }

    @Override
    public String removeCar(CarDriver cd)
    {
        return removeCar(cd);
    }

    public int setSpeed()
    {
        return 10;
    }
}
