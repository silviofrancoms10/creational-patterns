package br.com.silviofrancoms.abstractfactory.apple.model.packing;

public class USPacking implements Packing{
    @Override
    public String pack() {
        return "\t- English Packing";
    }
}
