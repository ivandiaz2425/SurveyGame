package com.i034114.surveygame.Utilities;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by IVANCHO on 15/11/2017.
 */

public class Tablas {

    public static final String TABLA_NAME_USERS = "users";
    public static final String TABLA_FIELD_ID = "id";
    public static final String TABLA_FIELD_NAME = "name";
    public static final String TABLA_FIELD_IDENTIFICATION_CARD = "identification card";
    public static final String TABLA_FIELD_PHONE = "phone";
    public static final String TABLA_FIELD_EMAIL = "email";
    public static final String TABLA_FIELD_PASSWORD = "Password";
    public static final String TABLA_FIELD_PASSWORD_1 = "Password_1";
    public static final String TABLA_FIELD_STATUS = "status";
    public static final String CREATE_TABLE_USERS =
            "CREATE TABLE "+ TABLA_NAME_USERS+" ("+
                    TABLA_FIELD_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    TABLA_FIELD_NAME+" TEXT, "+
                    TABLA_FIELD_IDENTIFICATION_CARD+"TEXT,"+
                    TABLA_FIELD_PHONE+" TEXT, "+
                    TABLA_FIELD_EMAIL+" TEXT,"+
                    TABLA_FIELD_PASSWORD+" TEXT,"+
                    TABLA_FIELD_PASSWORD_1+" TEXT,"+
                    TABLA_FIELD_STATUS+" TEXT)";



}
