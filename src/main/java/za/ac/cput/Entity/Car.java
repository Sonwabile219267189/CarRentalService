package za.ac.cput.Entity;


/*Car.java
  Entity for the Car
  Author: Zintle Zothe (216130565)
  Date: 14 March 2022
 */


public class Car {
    private String carId;
    private String carModel;
    private String carColour;
    private String yearOfMake;
    private String pricePerDay;



    private Car(){
    }


    private Car(Builder builder){
        this.carId=builder.carId;
        this.carModel=builder.carModel;
        this.carColour=builder.carColour;
        this.yearOfMake=builder.yearOfMake;
        this.pricePerDay=builder.pricePerDay;
    }


    public String getCarId(){
        return carId;
    }

    public String getCarModel(){
        return carModel;
    }

    public String getCarColour(){
        return carColour;
    }

    public String getYearOfMake(){
        return yearOfMake;
    }

    public String getPricePerDay(){
        return pricePerDay;
    }



    public static class Builder{

        private String carId;
        private String carModel;
        private String carColour;
        private String yearOfMake;
        private String pricePerDay;

        public Builder setCarId(String carId){
            this.carId=carId;

            return this;

        }

        public Builder setCarModel(String carModel){
            this.carModel=carModel;

            return this;
        }

        public Builder setCarColour(String carColour){
            this.carColour=carColour;

            return this;
        }

        public Builder setYearOfMake(String yearOfMake){
            this.yearOfMake=yearOfMake;

            return this;
        }

        public Builder setPricePerDay(String pricePerDay){
            this.pricePerDay=pricePerDay;

            return this;
        }


        //
        public Car build(){
            return new Car(this);
        }

        public Builder copy(Car car){
            this.carId=car.carId;
            this.carModel=car.carModel;
            this.carColour=car.carColour;
            this.yearOfMake=car.yearOfMake;
            this.pricePerDay=car.pricePerDay;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "carId='" + carId + '\'' +
                    ", carModel='" + carModel + '\'' +
                    ", carColour='" + carColour + '\'' +
                    ", yearOfMake='" + yearOfMake + '\'' +
                    ", pricePerDay='" + pricePerDay + '\'' +
                    '}';
        }
    }
}