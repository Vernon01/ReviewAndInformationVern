package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class foodPrice extends market{

    public foodPrice (food food1)
    {
        super(food1,"Price");
        this.food1.regPrice(this);
    }
}
