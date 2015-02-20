package za.ac.cput.implement;

import za.ac.cput.Person;

/**
 * Created by student on 2015/02/19.
 */
public class Personimp implements Person {
    @Override
    public String name(String a)
    {
        return a;
    }

    @Override
    public int age1(int a, int b)
    {
        return a-b;
    }
}
