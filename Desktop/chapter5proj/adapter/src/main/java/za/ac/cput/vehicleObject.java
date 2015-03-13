package za.ac.cput;

/**
 * Created by student on 2015/03/09.
 */
public class vehicleObject implements vehicleInfo {

    vehicle vehic;

    public vehicleObject()
    {
        vehic = new vehicle();
    }

    @Override
    public int getWheelsCar()
    {
        return carWheels(vehic.getWheels());
    }

    @Override
    public void setWheelsCar(int wheels)
    {
        vehic.setWheels(carWheels(wheels));
    }

    @Override
    public int getWheelsTruck()
    {
        return truckWheels(vehic.getWheels());
    }

    @Override
    public void setWheelsTruck(int wheels)
    {
        vehic.setWheels(truckWheels(wheels));
    }

    public int carWheels(int c)
    {
        return c = 4;
    }

    public int truckWheels(int t)
    {
        return t = 18;
    }
}
