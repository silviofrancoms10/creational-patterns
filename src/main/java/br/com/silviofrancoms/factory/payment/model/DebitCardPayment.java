package br.com.silviofrancoms.factory.payment.model;

public class DebitCardPayment extends PaymentType {

    @Override
    public void getPayment() {
        System.out.println("Debit Card Payment Selected");
    }
}
