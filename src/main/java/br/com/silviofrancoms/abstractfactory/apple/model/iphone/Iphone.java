package br.com.silviofrancoms.abstractfactory.apple.model.iphone;

import br.com.silviofrancoms.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public abstract class Iphone {
    CountryRulesAbstractFactory rules;

    public Iphone(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public abstract void getHardware();

    public void assemble(){
        System.out.println("Assembling all the Hardware");
    }

    public void certificates(){
        System.out.println("Testing all the certificates");
        System.out.println(rules.getCertificates().applyCertification());
    }

    public void pack() {
        System.out.println("Packing the device");
        System.out.println(rules.getPacking().pack());
    }
}
