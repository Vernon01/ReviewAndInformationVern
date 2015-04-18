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


        public placeMovieSet build() {return new placeMovieSet(this);}
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
