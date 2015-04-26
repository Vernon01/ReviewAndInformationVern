package ReviewAndInformation.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
public class producer implements Serializable{
    private String name;
    private int age;
    private int yearsProducing;

    private producer()
    {}

    public producer (Builder builder)
    {
        name = builder.name;
        age = builder.age;
        yearsProducing = builder.yearsProducing;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public int getYearsProducing() {return yearsProducing;}

    public static class Builder {

        private String name;
        private int age;
        private int yearsProducing;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int value) {
            this.age = value;
            return this;
        }

        public Builder yearsProducing(int value) {
            this.yearsProducing = value;
            return this;
        }

        public Builder copy(producer value)
        {
            this.name = value.getName();
            this.age = value.getAge();
            this.yearsProducing = value.getYearsProducing();
            return this;
        }

        public producer build() {return new producer(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        producer producer = (producer) o;

        if (age != producer.age) return false;
        if (yearsProducing != producer.yearsProducing) return false;
        if (name != null ? !name.equals(producer.name) : producer.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {return name != null ? name.hashCode() : 0;}

    @Override
    public String toString() {
        return "Movie{" +
                "name=" + name +
                ", yearsProducing='" + yearsProducing + '\'' +
                '}';
    }
}
