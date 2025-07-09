package br.com.silviofrancoms.factory.payment.model;

public abstract class PaymentType {

    public abstract void getPayment();

    public void payMethod() {
        System.out.println("Chosing payment method");
    }

    public void payCommunicate() {
        System.out.println("Communicating with payment method");
    }
}
