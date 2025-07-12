package br.com.silviofrancoms.abstractfactory.app.service.factory;

import br.com.silviofrancoms.abstractfactory.app.service.services.CarService;
import br.com.silviofrancoms.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {
    UserService getUserService();
    CarService getCarService();
}
