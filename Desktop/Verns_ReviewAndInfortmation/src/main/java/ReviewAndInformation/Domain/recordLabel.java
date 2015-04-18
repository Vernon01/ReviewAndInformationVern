package ReviewAndInformation.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
public class recordLabel implements Serializable {

    private String label;

    private recordLabel()
    {}

    public recordLabel (Builder builder)
    {
        label = builder.label;
    }

    public String getLabel() {return label;}

    public static class Builder {

        private String label;

        public Builder(String label) {
            this.label = label;
        }


        public recordLabel build() {return new recordLabel(this);}
    }

    @Override
    public int hashCode() {return label != null ? label.hashCode() : 0;}

    @Override
    public String toString() {
        return "Record Label{" +
                "is=" + label +
                '}';
    }
}
