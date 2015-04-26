package ReviewAndInformation.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
public class director implements Serializable {

    private String name;
    private int age;
    private int yearsDirecting;

    private director()
    {}

    public director (Builder builder)
    {
        name = builder.name;
        age = builder.age;
        yearsDirecting = builder.yearsDirecting;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public int getYearsDirecting() {return yearsDirecting;}

    public static class Builder {

        private String name;
        private int age;
        private int yearsDirecting;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int value) {
            this.age = value;
            return this;
        }

        public Builder yearsDirecting(int value) {
            this.yearsDirecting = value;
            return this;
        }

        public Builder copy(director value)
        {
            this.name = value.getName();
            this.age = value.getAge();
            this.yearsDirecting = value.getYearsDirecting();
            return this;
        }

        public director build() {return new director(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        director director = (director) o;

        if (age != director.age) return false;
        if (yearsDirecting != director.yearsDirecting) return false;
        if (name != null ? !name.equals(director.name) : director.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {return name != null ? name.hashCode() : 0;}

    @Override
    public String toString() {
        return "Movie{" +
                "name=" + name +
                ", yearsDirecting='" + yearsDirecting + '\'' +
                '}';
    }
}
