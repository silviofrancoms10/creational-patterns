package br.com.silviofrancoms.factory.payment.model;

public class CreditCardPayment extends  PaymentType {

    @Override
    public void getPayment() {
        System.out.println("Credit Card Payment Selected");
    }
}
