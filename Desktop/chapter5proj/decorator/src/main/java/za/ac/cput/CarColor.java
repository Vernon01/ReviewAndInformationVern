package za.ac.cput;

/**
 * Created by student on 2015/03/10.
 */
public abstract class CarColor implements Car {

    Car car;

    public CarColor(Car car)
    {
        this.car = car;
    }
}
