package br.com.silviofrancoms.abstractfactory;

import br.com.silviofrancoms.abstractfactory.apple.factory.Iphone11Factory;
import br.com.silviofrancoms.abstractfactory.apple.factory.IphoneFactory;
import br.com.silviofrancoms.abstractfactory.apple.factory.IphoneXFactory;
import br.com.silviofrancoms.abstractfactory.apple.factory.abstractfactory.BrazilianRulesAbstractFactory;
import br.com.silviofrancoms.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.silviofrancoms.abstractfactory.apple.factory.abstractfactory.USRulesAbstractFactory;
import br.com.silviofrancoms.abstractfactory.apple.model.iphone.Iphone;
import br.com.silviofrancoms.abstractfactory.apple.model.iphone.Iphone11Pro;

public class Client {
    public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        IphoneFactory iphoneFactory = new IphoneXFactory(rules);
        Iphone iphone1 = iphoneFactory.orderIphone("standard");

        System.out.println("\n-------------------------------------------------\n");

        IphoneFactory iphone11Factory = new Iphone11Factory(rules);
        Iphone iphone2 = iphone11Factory.orderIphone("highEnd");

        System.out.println("\n##################################################################\n");

        CountryRulesAbstractFactory rules2 = new USRulesAbstractFactory();
        IphoneFactory iphoneXFactory = new IphoneXFactory(rules2);
        Iphone iphone3 = iphoneXFactory.orderIphone("highEnd");
    }
}
