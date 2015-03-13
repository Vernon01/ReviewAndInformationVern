package za.ac.cput;

/**
 * Created by student on 2015/03/13.
 */
public class food {

    foodSeller fSeller;
    foodPrice fPrice;

    public food()
    {}

    public void regFoodSeller(foodSeller fSeller)
    {
        this.fSeller = fSeller;
    }


    public void regPrice(foodPrice fPrice)
    {
        this.fPrice = fPrice;
    }
}
