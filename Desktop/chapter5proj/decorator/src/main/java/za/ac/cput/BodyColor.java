package za.ac.cput;

/**
 * Created by student on 2015/03/10.
 */
public class BodyColor extends CarColor {

    public BodyColor(Car car)
    {
        super(car);
    }


    @Override
    public String make()
    {
        return color();
    }

    public String color()
    {
        return "red";
    }
}
