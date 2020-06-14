package com.yesimyildirim.roomwithsqlite

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.yesimyildirim.roomwithsqlite.model.DataClass

@Dao
interface DataDao {
    @Query("SELECT * FROM dataTable")
    fun getAllData(): List<DataClass>

    @Insert
    fun insertAll(vararg data: DataClass)
}