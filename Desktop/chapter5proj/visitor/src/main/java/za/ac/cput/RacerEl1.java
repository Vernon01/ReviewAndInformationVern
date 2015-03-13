package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class RacerEl1 implements RaceElement {

    int a;

    public RacerEl1(int a)
    {
        this.a = a;
    }
    @Override
    public int timesRaced(Racer race)
    {
        return race.numWins(this);
    }
}
