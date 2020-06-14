package com.yesimyildirim.roomwithsqlite

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yesimyildirim.roomwithsqlite.model.DataClass

@Database(entities = [DataClass::class], version = 1)
abstract class Database : RoomDatabase(){
    abstract fun dataDao(): DataDao

}