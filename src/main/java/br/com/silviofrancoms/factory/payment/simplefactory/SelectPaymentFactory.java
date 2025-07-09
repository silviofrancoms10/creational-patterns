package br.com.silviofrancoms.factory.payment.simplefactory;

import br.com.silviofrancoms.factory.payment.model.CreditCardPayment;
import br.com.silviofrancoms.factory.payment.model.DebitCardPayment;
import br.com.silviofrancoms.factory.payment.model.PaymentType;
import br.com.silviofrancoms.factory.payment.model.PixPayment;

public class SelectPaymentFactory {

    public static PaymentType getPayment(String payment) {
        PaymentType paymentType = null;

        if (payment.equals("CREDIT_CARD")) {
            paymentType = new CreditCardPayment();
        } else if (payment.equals("DEBIT_CARD")) {
            paymentType = new DebitCardPayment();
        } else if (payment.equals("PIX")) {
            paymentType = new PixPayment();
        }

        if(paymentType!= null){
            paymentType.payMethod();
            paymentType.getPayment();
            paymentType.payCommunicate();
            System.out.println();
        }

        return paymentType;
    }

}
