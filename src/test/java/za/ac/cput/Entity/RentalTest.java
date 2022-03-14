package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RentalTest {

    @Test
    public void testRental(){
        Rental rental = new Rental.Builder()
                .setIsRented(true)
                .build();
        assertNotNull(rental);
        System.out.println(rental.toString());
    }

}