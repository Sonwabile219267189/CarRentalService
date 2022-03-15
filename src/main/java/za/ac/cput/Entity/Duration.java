/* CarRentalService.java
 Entity for a Duration Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 15 March 2022
 */

package za.ac.cput.Entity;

import sun.security.provider.certpath.Builder;

public class Duration {

    //declaration of private fields
    private String durationId;
    private String customerId;
    private String carId;
    private String datePicked;
    private String dateReturn;

    //Creating a builder pattern for Subject
    public Duration(Builder builder) {
        this.durationId = builder.durationId;
        this.customerId = builder.customerId;
        this.carId = builder.carId;
        this.datePicked = builder.datePicked;
        this.dateReturn = builder.dateReturn;
    }

    //toString method to return values
    @Override
    public String toString() {
        return "Duration{" +
                "durationId='" + durationId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", carId='" + carId + '\'' +
                ", datePicked='" + datePicked + '\'' +
                ", dateReturn='" + dateReturn + '\'' +
                '}';
    }

    public static class Builder {

        private String durationId;
        private String customerId;
        private String carId;
        private String datePicked;
        private String dateReturn;

        public void setDurationId(String durationId) {
            this.durationId = durationId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public void setCarId(String carId) {
            this.carId = carId;
        }

        public void setDatePicked(String datePicked) {
            this.datePicked = datePicked;
        }

        public void setDateReturn(String dateReturn) {
            this.dateReturn = dateReturn;
        }

        public Duration build(){
            return new Duration(this);
        }
        // copy constructor to creates an object using another object of the same Java class
        public Builder copy(Duration duration){
            this.durationId = duration.durationId;
            this.customerId = duration.customerId;
            this.carId = duration.carId;
            this.datePicked = duration.datePicked;
            this.dateReturn = duration.dateReturn;

            return this;
        }

        public Duration builder() {
            return build();
        }
    }

    public String getDurationId() {
        return durationId;
    }

}
