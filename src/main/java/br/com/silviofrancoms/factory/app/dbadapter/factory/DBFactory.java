package br.com.silviofrancoms.factory.app.dbadapter.factory;

import br.com.silviofrancoms.factory.app.dbadapter.db.DB;

public interface DBFactory {
    DB getDatabase();
}
