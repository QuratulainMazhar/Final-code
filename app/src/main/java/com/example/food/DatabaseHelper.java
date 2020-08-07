package com.example.food;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Users.db";
    private static final String CREATE_TBL_USERS = "CREATE TABLE "
            + DatabaseContract.Users.TABLE_NAME + " ("
            + DatabaseContract.Users._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + DatabaseContract.Users.COL_NAME + " TEXT , "
            +DatabaseContract.Users.COL_PASSWORD+" TEXT , "
            +DatabaseContract.Users.COL_CONFIRMPASSWORD+" TEXT ) ";


    public static final String TABLE = "recipies";
    public static final String COL_1 = "ID";
    public static final String COL_T = "tital";
    public static final String COL_D = "discription";

    public boolean insertData(String tita,String dis) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_T, tita);
        contentValues.put(COL_D, dis);

        long result = db.insert(TABLE, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public Cursor receive() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE, null);
        return res;
    }



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TBL_USERS);
        db.execSQL("create table " + TABLE + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,TITAL TEXT,DISCRIPTION TEXT)");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);

    }



}
