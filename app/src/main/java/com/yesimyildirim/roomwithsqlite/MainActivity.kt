package com.yesimyildirim.roomwithsqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.yesimyildirim.roomwithsqlite.model.DataClass
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_main.*
import androidx.appcompat.widget.Toolbar;

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val data: List<DataClass>
        val db: Database = Room.databaseBuilder(this, Database::class.java, "data")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
        data = db.dataDao().getAllData()
        val x=5
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DataRecyclerAdapter(data, this@MainActivity)

        fab.setOnClickListener {
            val intent = Intent(this, DataRecord::class.java)
            startActivity(intent)
        }
    }
}