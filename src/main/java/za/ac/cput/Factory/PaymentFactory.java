/*Payment.java
 * PaymentFactory entity
 *Author : Hlombekazi Mbelu 209024666
 * Date 7 April 2022
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.Payment;
import za.ac.cput.Helper.GenerateID;

public class PaymentFactory {
    public static Payment createPayment(Double paymentAmount , String bankAccount )
    {
        String pay = GenerateID.generateUUID();
        Payment payment= new Payment.Builder()
                .setPaymentId(pay)
                .setPaymentAmount(paymentAmount)
                .setBankNumber(bankAccount)
                .build();

        return payment;
    }

}
