package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class EngineCheck {

    String size;
    Car car;

    public EngineCheck(String size, Car car)
    {
        this.size = size;
        this.car = car;
    }

    public void setCar(Car car)
    {}

    public void getSize()
    {}

    public String getType()
    {
        return car.engineSize();
    }
}
