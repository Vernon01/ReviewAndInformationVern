package ReviewAndInformation.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
public class placeMovieSet implements Serializable {

    private String cityDirectedIn;

    private placeMovieSet()
    {}

    public placeMovieSet (Builder builder)
    {
        cityDirectedIn = builder.cityDirectedIn;
    }

    public String getCityDirectedIn() {return cityDirectedIn;}

    public static class Builder {

        private String cityDirectedIn;

        public Builder(String cityDirectedIn) {
            this.cityDirectedIn = cityDirectedIn;
        }

        public Builder copy(placeMovieSet value)
        {
            this.cityDirectedIn = value.getCityDirectedIn();
            return this;
        }

        public placeMovieSet build() {return new placeMovieSet(this);}
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        placeMovieSet that = (placeMovieSet) o;

        if (cityDirectedIn != null ? !cityDirectedIn.equals(that.cityDirectedIn) : that.cityDirectedIn != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {return cityDirectedIn != null ? cityDirectedIn.hashCode() : 0;}

    @Override
    public String toString() {
        return "Movie{" +
                "cityDirectedIn=" + cityDirectedIn +
                '}';
    }
}
