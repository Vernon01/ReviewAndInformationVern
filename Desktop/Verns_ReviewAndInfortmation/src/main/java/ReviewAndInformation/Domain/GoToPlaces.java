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

        public Builder copy(GoToPlaces value)
        {
            this.cityToVisit = value.getCityToVisit();
            return this;
        }

        public GoToPlaces build() {return new GoToPlaces(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoToPlaces that = (GoToPlaces) o;

        if (cityToVisit != null ? !cityToVisit.equals(that.cityToVisit) : that.cityToVisit != null) return false;

        return true;
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
