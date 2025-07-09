package br.com.silviofrancoms.factory.payment;

import br.com.silviofrancoms.factory.payment.model.PaymentType;
import br.com.silviofrancoms.factory.payment.simplefactory.SelectPaymentFactory;

public class Client {
    public static void main(String[] args) {

        PaymentType credito = SelectPaymentFactory.getPayment("CREDIT_CARD");
        System.out.println(credito);

        PaymentType debito = SelectPaymentFactory.getPayment("DEBIT_CARD");
        System.out.println(debito);
    }
}