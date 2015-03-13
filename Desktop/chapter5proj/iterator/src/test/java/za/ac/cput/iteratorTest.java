package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by student on 2015/03/13.
 */
public class iteratorTest {

    Car car1 = new Car("Honda", 7000);
    Car car2 = new Car("BMW", 5000);

    CarList cList = new CarList();

    @Test
    public void testIteratorHonda() throws Exception {
        cList.addCar(car1);
        cList.addCar(car2);
        Iterator<Car> iterator = cList.iterator();
        iterator.hasNext();
        Car c1 = iterator.next();
        Assert.assertEquals(c1, c1);
    }

}
