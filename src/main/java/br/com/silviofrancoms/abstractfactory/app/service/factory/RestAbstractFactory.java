package br.com.silviofrancoms.abstractfactory.app.service.factory;

import br.com.silviofrancoms.abstractfactory.app.service.services.CarRestApiService;
import br.com.silviofrancoms.abstractfactory.app.service.services.CarService;
import br.com.silviofrancoms.abstractfactory.app.service.services.UserRestApiService;
import br.com.silviofrancoms.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }
}
