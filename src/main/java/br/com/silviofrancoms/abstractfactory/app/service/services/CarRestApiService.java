package br.com.silviofrancoms.abstractfactory.app.service.services;

public class CarRestApiService implements CarService{
    @Override
    public void save(String model) {
        System.out.println("Saving "+model+" through REST API interface");
    }

    @Override
    public void update(String newModel) {
        System.out.println("Updating "+newModel+" through REST API interface");
    }
}
