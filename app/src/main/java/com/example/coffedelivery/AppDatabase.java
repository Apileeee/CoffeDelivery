package com.example.coffedelivery;

import androidx.room.Database;
import androidx.room.RoomDatabase;


//untuk entitas model database
@Database(entities = {DatabaseModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
