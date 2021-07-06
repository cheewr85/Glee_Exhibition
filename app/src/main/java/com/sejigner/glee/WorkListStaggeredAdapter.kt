package com.sejigner.glee

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WorkListStaggeredAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var listOfWorks = listOf<WorkModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return WorkListStaggeredViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_grid_work, parent, false))
    }

    override fun getItemCount(): Int = listOfWorks.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val workViewHolder = viewHolder as WorkListStaggeredViewHolder
        workViewHolder.bindView(listOfWorks[position])
    }

    fun setWorkList(listOfWorks: List<WorkModel>) {
        this.listOfWorks = listOfWorks
        notifyDataSetChanged()
    }
}