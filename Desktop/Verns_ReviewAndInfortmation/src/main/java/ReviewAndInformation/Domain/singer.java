package ReviewAndInformation.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
public class singer implements Serializable {

    private String singing;

    private singer()
    {}

    public singer (Builder builder)
    {
        singing = builder.singing;
    }

    public String getSinging() {return singing;}

    public static class Builder {

        private String singing;

        public Builder(String singing) {
            this.singing = singing;
        }


        public singer build() {return new singer(this);}
    }

    @Override
    public int hashCode() {return singing != null ? singing.hashCode() : 0;}

    @Override
    public String toString() {
        return "Singer{" +
                "is the following=" + singing +
                '}';
    }
}
