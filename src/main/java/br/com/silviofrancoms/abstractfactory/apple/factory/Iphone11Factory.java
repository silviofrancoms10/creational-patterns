package br.com.silviofrancoms.abstractfactory.apple.factory;

import br.com.silviofrancoms.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.silviofrancoms.abstractfactory.apple.model.iphone.Iphone;
import br.com.silviofrancoms.abstractfactory.apple.model.iphone.Iphone11;
import br.com.silviofrancoms.abstractfactory.apple.model.iphone.Iphone11Pro;

public class Iphone11Factory extends IphoneFactory {

    public Iphone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected Iphone createIphone(String level) {
        if ("standard".equals(level)) {
            return new Iphone11(rules);
        } else if ("highEnd".equals(level)) {
            return new Iphone11Pro(rules);
        } else return null;
    }
}
