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

        public Builder(String cityInformation) {
            this.cityInformation = cityInformation;
        }

        public Builder copy(cityInfo value)
        {
            this.cityInformation = value.getCityInformation();
            return this;
        }

        public cityInfo build() {return new cityInfo(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        cityInfo cityInfo = (cityInfo) o;

        if (cityInformation != null ? !cityInformation.equals(cityInfo.cityInformation) : cityInfo.cityInformation != null)
            return false;

        return true;
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
