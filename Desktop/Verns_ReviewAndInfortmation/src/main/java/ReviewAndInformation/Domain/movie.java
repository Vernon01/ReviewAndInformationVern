package ReviewAndInformation.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
public class movie implements Serializable {

    private String name;
    private int length;
    private String category;

    private movie()
    {}

    public movie (Builder builder)
    {
        name = builder.name;
        length = builder.length;
        category = builder.category;
    }

    public String getName() {return name;}
    public int getLength() {return length;}
    public String getCategory() {return category;}

    public static class Builder {

        private String name;
        private int length;
        private String category;

        public Builder(String name) {
            this.name = name;
        }

        public Builder length(int value) {
            this.length = value;
            return this;
        }

        public Builder category(String value) {
            this.category = value;
            return this;
        }

        public movie build() {return new movie(this);}
    }

    @Override
    public int hashCode() {return name != null ? name.hashCode() : 0;}

    @Override
    public String toString() {
        return "Movie{" +
                "name=" + name +
                ", category='" + category + '\'' +
                '}';
    }
}
