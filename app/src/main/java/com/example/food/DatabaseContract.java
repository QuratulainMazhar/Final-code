package com.example.food;
import android.provider.BaseColumns;
public class DatabaseContract {
    public DatabaseContract() {}
    public static abstract class Users implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String COL_NAME = "fullname";
        public static final String COL_PASSWORD = "password";
        public static final String COL_CONFIRMPASSWORD = "confirm";

    }



}

