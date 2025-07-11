package br.com.silviofrancoms.abstractfactory.apple.model.packing;

public class BrazilianPacking implements Packing {
    @Override
    public String pack() {
        return "\t- Empacotando em Português ";
    }
}
