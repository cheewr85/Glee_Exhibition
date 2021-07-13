package com.sejigner.glee

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WorkListMyPageStaggeredAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var listOfWorks = listOf<WorkModelMyPage>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return WorkListMyPageStaggeredViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_grid_work_my_page, parent, false))
    }

    override fun getItemCount(): Int = listOfWorks.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val workViewHolder = viewHolder as WorkListMyPageStaggeredViewHolder
        workViewHolder.bindView(listOfWorks[position])
    }

    fun setWorkList(listOfWorks: List<WorkModelMyPage>) {
        this.listOfWorks = listOfWorks
        notifyDataSetChanged()
    }
}