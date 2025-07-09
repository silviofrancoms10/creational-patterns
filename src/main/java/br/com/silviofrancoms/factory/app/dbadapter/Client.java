package br.com.silviofrancoms.factory.app.dbadapter;

import br.com.silviofrancoms.factory.app.dbadapter.db.DB;
import br.com.silviofrancoms.factory.app.dbadapter.factory.OracleFactory;
import br.com.silviofrancoms.factory.app.dbadapter.factory.PostgresFactory;

public class Client {
    public static void main(String[] args) {

        DB postgres = new PostgresFactory().getDatabase();
        postgres.query("select * from customer where id = ?");
        postgres.update("update customer set name = ? where id = ?");

        System.out.println();

        DB oracle = new OracleFactory().getDatabase();
        oracle.query("select * from customer where id = ?");
        oracle.update("update customer set name = ? where id = ?");

    }
}
