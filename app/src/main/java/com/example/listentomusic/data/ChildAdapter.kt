package com.example.listentomusic.data

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ChildAdapter(private val dataList : List<ChildItem>) :
    RecyclerView.Adapter<ChildAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class ViewHolder(val view : View) : RecyclerView.ViewHolder(view){

    }
}