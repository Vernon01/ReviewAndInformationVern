package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class Car {

    String CarMake;
    int CarPrice;

    public Car(String CarMake, int CarPrice)
    {
        this.CarMake = CarMake;
        this.CarPrice = CarPrice;
    }

    public String toString()
    {
        return CarMake + " cost about " + CarPrice;
    }
}
