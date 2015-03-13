package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class Car implements CarCondition {

    CarCondition cd;

    public Car(CarCondition cd)
    {
        this.cd = cd;
    }

    public void setCarCondition(CarCondition cd)
    {
        this.cd = cd;
    }

    @Override
    public String condition()
    {
        return cd.condition();
    }
}
