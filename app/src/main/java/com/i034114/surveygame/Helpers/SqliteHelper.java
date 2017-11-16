package com.i034114.surveygame.Helpers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.i034114.surveygame.Models.Users;
import com.i034114.surveygame.Utilities.Tablas;

/**
 * Created by IVANCHO on 15/11/2017.
 */

public class SqliteHelper extends SQLiteOpenHelper {
    SQLiteDatabase db;

    public SqliteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Tablas.CREATE_TABLE_USERS);
        this.db = db;
    }
    public void insertUser(Users U){

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Tablas.TABLA_FIELD_NAME, U.getName());
        values.put(Tablas.TABLA_FIELD_IDENTIFICATION_CARD, U.getIdentification_card());
        values.put(Tablas.TABLA_FIELD_PHONE, U.getPhone());
        values.put(Tablas.TABLA_FIELD_EMAIL, U.getEmail());
        values.put(Tablas.TABLA_FIELD_PASSWORD, U.getPassword());
        values.put(Tablas.TABLA_FIELD_STATUS,  U.getStatus());

        db.insert(Tablas.TABLA_NAME_USERS, Tablas.TABLA_FIELD_ID, values);
        db.close();
    }

    public void searchPass(String uname) {
        db = this.getReadableDatabase();
        String query = "select uname, pass from " + Tablas.TABLA_NAME_USERS;
        Cursor cursor = db.rawQuery(query, null);
        String a;
        String b;
        b = "not found";
        if (cursor.moveToFirst()) {
            do {
                a = cursor.getString(0);

                if(a.equals(uname)) {
                    b = cursor.getString(1);
                    break;
                }
            }
            while (cursor.moveToNext());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_NAME_USERS);
        onCreate(db);
    }
}
