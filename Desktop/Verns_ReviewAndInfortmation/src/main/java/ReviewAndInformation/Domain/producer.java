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

        public producer build() {return new producer(this);}
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
