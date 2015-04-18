package ReviewAndInformation.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
public class musicType implements Serializable {

    private String rock;

    private musicType()
    {}

    public musicType (Builder builder)
    {
        rock = builder.rock;
    }

    public String getRock() {return rock;}

    public static class Builder {

        private String rock;

        public Builder(String rock) {
            this.rock = rock;
        }


        public musicType build() {return new musicType(this);}
    }

    @Override
    public int hashCode() {return rock != null ? rock.hashCode() : 0;}

    @Override
    public String toString() {
        return "Music type{" +
                "Is the following=" + rock +
                '}';
    }
}
