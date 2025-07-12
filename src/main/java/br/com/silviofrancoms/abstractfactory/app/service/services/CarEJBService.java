package br.com.silviofrancoms.abstractfactory.app.service.services;

public class CarEJBService implements CarService{
    @Override
    public void save(String model) {
        System.out.println("Saving "+model+" through EJB's interface");
    }

    @Override
    public void update(String newModel) {
        System.out.println("Updating "+newModel+" through EJB's interface");
    }
}
