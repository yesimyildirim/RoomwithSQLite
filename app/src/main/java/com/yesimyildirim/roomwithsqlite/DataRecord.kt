package com.yesimyildirim.roomwithsqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.yesimyildirim.roomwithsqlite.model.DataClass
import kotlinx.android.synthetic.main.activity_data_record.*

class DataRecord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_record)
        val db: Database = Room.databaseBuilder(applicationContext, Database::class.java, "data")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
        btn_Add.setOnClickListener {
            val data = DataClass(
                titleRecord_text.text.toString(),
                headRecord_text.text.toString(),
                descriptionRecord_text.text.toString()
            )
            db.dataDao().insertAll(data)
            val a=5
            db.dataDao().getAllData()

            val b=3
            startActivity(Intent(this@DataRecord, MainActivity::class.java))
            //finish()
        }
    }
}