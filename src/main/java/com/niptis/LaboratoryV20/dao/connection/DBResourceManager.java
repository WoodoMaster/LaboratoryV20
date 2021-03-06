package com.niptis.LaboratoryV20.dao.connection;

import java.util.ResourceBundle;

public class DBResourceManager {


    private final static DBResourceManager instance = new DBResourceManager();

    private final ResourceBundle bundle = ResourceBundle.getBundle("database");

    public static DBResourceManager getInstance() {
        return instance;
    }

    public String getValue(String key) {
        return bundle.getString(key);
    }
}

