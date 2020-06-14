package com.yesimyildirim.roomwithsqlite

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yesimyildirim.roomwithsqlite.model.DataClass
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class DataRecyclerAdapter (private val data : List<DataClass>, val context: Context) : RecyclerView.Adapter<DataRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view_item, p0, false))
    }

    override fun getItemCount(): Int=data.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitle?.setText(data[position].title)
        holder.tvSubject?.setText(data[position].head)
        holder.tvDescrition?.setText(data[position].description)
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvTitle = view.title_text
        val tvSubject = view.head_text
        val tvDescrition = view.description_text
    }
}