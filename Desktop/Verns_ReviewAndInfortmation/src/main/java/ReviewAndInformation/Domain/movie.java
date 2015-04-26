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

        public Builder copy(movie value)
        {
            this.name = value.getName();
            this.length = value.getLength();
            this.category = value.getCategory();
            return this;
        }

        public movie build() {return new movie(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        movie movie = (movie) o;

        if (length != movie.length) return false;
        if (category != null ? !category.equals(movie.category) : movie.category != null) return false;
        if (name != null ? !name.equals(movie.name) : movie.name != null) return false;

        return true;
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
