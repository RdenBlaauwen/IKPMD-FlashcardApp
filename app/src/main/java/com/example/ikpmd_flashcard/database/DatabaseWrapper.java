package com.example.ikpmd_flashcard.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseWrapper extends SQLiteOpenHelper {
    public static SQLiteDatabase SQLDB;
    private static DatabaseWrapper instance;
    public static final String dbName = "cards.db";
    public static final int dbVersion = 1;

    private DatabaseWrapper(Context ctx) {
        super(ctx, dbName, null, dbVersion);
    }

    public static synchronized DatabaseWrapper getHelper (Context ctx){
        if (instance == null){
            instance = new DatabaseWrapper(ctx);
            SQLDB = instance.getWritableDatabase();
        }
        return instance;
    }

    public DatabaseWrapper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
