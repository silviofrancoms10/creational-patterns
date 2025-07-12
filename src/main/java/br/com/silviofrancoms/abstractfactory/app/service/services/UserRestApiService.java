package br.com.silviofrancoms.abstractfactory.app.service.services;

public class UserRestApiService implements UserService{
    @Override
    public void save(String name) {
        System.out.println("Saving "+name+" through REST API interface");
    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("Removing User #"+id+" through REST API interface");
        return true;
    }
}
