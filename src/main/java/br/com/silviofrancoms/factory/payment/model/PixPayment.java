package br.com.silviofrancoms.factory.payment.model;

public class PixPayment extends  PaymentType {

    @Override
    public void getPayment() {

        System.out.println("Pix Payment Selected");
    }
}
