package za.ac.cput;

/**
 * Created by student on 2015/03/09.
 */
public class motorBike implements Components {

    String sound;

    public motorBike (String sound)
    {
        this.sound = sound;
    }

    @Override
    public String startEngine()
    {
        return "motorbike starts engine";
    }

    @Override
    public String stopEngine()
    {
       return "motorbike switches off engine";
    }
}
