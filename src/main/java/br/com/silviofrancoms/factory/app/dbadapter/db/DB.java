package br.com.silviofrancoms.factory.app.dbadapter.db;

public interface DB {

    void query(String sql);

    void update(String sql);
}
