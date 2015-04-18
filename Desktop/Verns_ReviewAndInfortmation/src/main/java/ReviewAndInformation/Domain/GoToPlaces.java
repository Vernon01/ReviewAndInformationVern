package ReviewAndInformation.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
public class GoToPlaces implements Serializable {

    private String cityToVisit;

    private GoToPlaces()
    {}

    public GoToPlaces (Builder builder)
    {
        cityToVisit = builder.cityToVisit;
    }

    public String getCityToVisit() {return cityToVisit;}

    public static class Builder {

        private String cityToVisit;

        public Builder(String cityToVisit) {
            this.cityToVisit = cityToVisit;
        }


        public GoToPlaces build() {return new GoToPlaces(this);}
    }

    @Override
    public int hashCode() {return cityToVisit != null ? cityToVisit.hashCode() : 0;}

    @Override
    public String toString() {
        return "Places to go to{" +
                "city to visit=" + cityToVisit +
                '}';
    }
}
