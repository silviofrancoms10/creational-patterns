package br.com.silviofrancoms.factory.app.dbadapter.db;

public class OracleDB implements DB {
    @Override
    public void query(String sql) {
        System.out.println(sql + " in Oracle database");
    }

    @Override
    public void update(String sql) {
        System.out.println(sql + " in Oracle database");
    }
}
