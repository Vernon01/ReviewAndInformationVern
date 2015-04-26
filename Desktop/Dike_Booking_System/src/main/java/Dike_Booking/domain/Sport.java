package Dike_Booking.domain;

/**
 * Created by student on 2015/04/18.
 */
public class Sport {
    private String sport_type;
    private String date;
    private String team;
    private String place;
    private double price;

    public String getSport_type()
    {
        return sport_type;
    }

    public String getDate()
    {
        return date;
    }

    public String getTeam()
    {
        return team;
    }
    public String getPlace()
    {
        return place;
    }

    public double getPrice()
    {
        return price;
    }

    public Sport (Builder builder){

        sport_type=builder.sport_type;
        date=builder.date;
        team=builder.team;
        place=builder.place;
        price=builder.price;

    }
    public static class Builder{
        private String sport_type;
        private String date;
        private String team;
        private String place;
        private double price;
        public Builder(String sport_type)
        {
            this.sport_type=sport_type;

        }

        public Builder date(String value)
        {
            this.date=value;
            return this;
        }

        public Builder team(String value)
        {
            this.team=value;
            return this;

        }

        public Builder place(String value)
        {
            this.place=value;
            return this;
        }
        public Builder price(double value)
        {
            this.price=value;
            return this;
        }
        public Sport build()
        {
            return new Sport(this);
        }

    }
    @Override
    public String toString()
    {
        return String.format(" type of sport:" + sport_type +"team: "+ team);
    }

}
