package br.com.silviofrancoms.abstractfactory.app.service;

import br.com.silviofrancoms.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.silviofrancoms.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.silviofrancoms.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.silviofrancoms.abstractfactory.app.service.services.CarService;
import br.com.silviofrancoms.abstractfactory.app.service.services.UserService;

public class Client {
    public static void main(String[] args) {
        ServicesAbstractFactory factory = new EJBAbstractFactory();
//        ServicesAbstractFactory factory = new RestAbstractFactory();

        UserService userService = factory.getUserService();
        userService.save("Jhon");
        userService.delete(5);

        CarService carService = factory.getCarService();
        carService.save("Corolla");
        carService.update("Civic");
    }
}
