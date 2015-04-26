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

        public Builder copy(recordLabel value)
        {
            this.label = value.getLabel();
            return this;
        }

        public recordLabel build() {return new recordLabel(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        recordLabel that = (recordLabel) o;

        if (label != null ? !label.equals(that.label) : that.label != null) return false;

        return true;
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
