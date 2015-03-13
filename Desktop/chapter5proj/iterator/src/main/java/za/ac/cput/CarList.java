package za.ac.cput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class CarList {

    List<Car> listCars;

    public CarList()
    {
        listCars = new ArrayList<Car>();
    }

    public void addCar(Car cr)
    {
        listCars.add(cr);
    }

    public Iterator<Car> iterator()
    {
        return new CarIterator();
    }

        class CarIterator implements Iterator<Car>
        {
            int index = 0;

            @Override
            public boolean hasNext()
            {
                if (index >= listCars.size())
                {
                    return false;
                }else
                {
                    return true;
                }
            }

            @Override
            public Car next()
            {
                return listCars.get(index++);
            }

            @Override
            public void remove()
            {
                listCars.remove(--index);
            }
        }
}
