package za.ac.cput;

/**
 * Created by student on 2015/03/09.
 */
public class car implements proto {

    String sound;

    public car (String sound)
    {
        this.sound = sound;
    }

    @Override
    public proto doClone()
    {
        return new car(sound);
    }

    public String toString()
    {
        return "That car sounds: " + sound;
    }
}
