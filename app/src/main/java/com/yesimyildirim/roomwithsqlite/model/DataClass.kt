package com.yesimyildirim.roomwithsqlite.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dataTable")
data class DataClass (@ColumnInfo(name = "title")
                      var title:String,
                      @ColumnInfo(name = "head")
                      var head:String,
                      @ColumnInfo(name = "description")
                      var description:String) {
        @PrimaryKey(autoGenerate = true)
        var dataId: Int = 0
}
