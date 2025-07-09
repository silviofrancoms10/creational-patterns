package br.com.silviofrancoms.factory.app.dbadapter.db;

public class PostgresDB implements DB {
    @Override
    public void query(String sql) {
        System.out.println(sql + " in Postgres database");
    }

    @Override
    public void update(String sql) {
        System.out.println(sql + " in Postgres database");
    }
}
