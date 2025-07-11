package br.com.silviofrancoms.abstractfactory.apple.factory.abstractfactory;

import br.com.silviofrancoms.abstractfactory.apple.model.certificate.Certificate;
import br.com.silviofrancoms.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();

    Packing getPacking();
}
