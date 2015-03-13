package za.ac.cput;

/**
 * Created by student on 2015/03/10.
 */
public class facade {

    public String name(String n)
    {
        part1 p1 = new part1();
        return p1.putTogether(n);
    }

    public String surname(String s)
    {
        part1 p1 = new part1();
        part2 p2 = new part2();
        return p2.addMore(p1, s);
    }
}
