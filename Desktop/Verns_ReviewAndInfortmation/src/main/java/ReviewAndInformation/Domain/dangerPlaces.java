package ReviewAndInformation.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
public class dangerPlaces implements Serializable {

    private String avoidedPlaces;

    private dangerPlaces()
    {}

    public dangerPlaces (Builder builder)
    {
        avoidedPlaces = builder.avoidedPlaces;
    }

    public String getAvoidedPlaces() {return avoidedPlaces;}

    public static class Builder {

        private String avoidedPlaces;

        public Builder(String avoidedPlaces) {
            this.avoidedPlaces = avoidedPlaces;
        }

        public Builder copy(dangerPlaces value)
        {
            this.avoidedPlaces = value.getAvoidedPlaces();
            return this;
        }

        public dangerPlaces build() {return new dangerPlaces(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        dangerPlaces that = (dangerPlaces) o;

        if (avoidedPlaces != null ? !avoidedPlaces.equals(that.avoidedPlaces) : that.avoidedPlaces != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {return avoidedPlaces != null ? avoidedPlaces.hashCode() : 0;}

    @Override
    public String toString() {
        return "Places to go to{" +
                "city to stay away from=" + avoidedPlaces +
                '}';
    }
}
