package br.com.silviofrancoms.abstractfactory.apple.factory;

import br.com.silviofrancoms.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.silviofrancoms.abstractfactory.apple.model.iphone.Iphone;
import br.com.silviofrancoms.abstractfactory.apple.model.iphone.IphoneX;
import br.com.silviofrancoms.abstractfactory.apple.model.iphone.IphoneXSMax;

public class IphoneXFactory extends IphoneFactory {

    public IphoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected Iphone createIphone(String level) {
        if ("standard".equals(level)) {
            return new IphoneX(rules);
        } else if ("highEnd".equals(level)) {
            return new IphoneXSMax(rules);
        } else return null;
    }
}