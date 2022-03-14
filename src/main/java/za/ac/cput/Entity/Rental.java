/**Rental.java
 * Entity for the Rental
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 24 March 2022
 */

package za.ac.cput.Entity;

public class Rental {

    private boolean isRented;

    public Boolean getIsRented(){
        return isRented;
    }

    private Rental(){}

    private Rental(Builder builder){
        this.isRented = builder.isRented;
    }

    public static class Builder{
        private boolean isRented;

        public Builder setIsRented(boolean isRented){
            this.isRented = isRented;
            return this;
        }

        public Builder copy(Rental rental){
            this.isRented = rental.isRented;
            return this;
        }

        public Rental build(){
            return new Rental(this);
        }
    }

    @Override
    public String toString() {
        return "Rental{" +
                "isRented=" + isRented +
                '}';
    }
}
