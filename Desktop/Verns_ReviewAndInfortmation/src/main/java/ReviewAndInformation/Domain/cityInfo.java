package ReviewAndInformation.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
public class cityInfo implements Serializable {

    private String cityInformation;

    private cityInfo()
    {}

    public cityInfo (Builder builder)
    {
        cityInformation = builder.cityInformation;
    }

    public String getCityInformation() {return cityInformation;}

    public static class Builder {

        private String cityInformation;

        public Builder(String cityToVisit) {
            this.cityInformation = cityInformation;
        }


        public cityInfo build() {return new cityInfo(this);}
    }

    @Override
    public int hashCode() {return cityInformation != null ? cityInformation.hashCode() : 0;}

    @Override
    public String toString() {
        return "Places to go to{" +
                "city info=" + cityInformation +
                '}';
    }
}
