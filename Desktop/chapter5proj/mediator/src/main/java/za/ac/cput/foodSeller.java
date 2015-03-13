package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class foodSeller extends market {

    public foodSeller (food food1)
    {
        super(food1,"Sell");
        this.food1.regFoodSeller(this);
    }
}
