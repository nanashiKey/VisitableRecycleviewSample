package com.irfandev.visitablerecycleviewsample.baseconfig

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.irfandev.visitablerecycleviewsample.appfactory.ItemTypeFactory


/**
 *   created by Irfan Assidiq
 *   email : assidiq.irfan@gmail.com
 **/
class BaseItemListAdapter(
    private val adapterTypeFactory: ItemTypeFactory,
    private val items : ArrayList<BaseItemModel> = arrayListOf())
    : RecyclerView.Adapter<AbstractViewHolder<BaseItemModel>>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AbstractViewHolder<BaseItemModel> {
        val view = inflateItem(parent, viewType)
        return adapterTypeFactory.createViewHolder(view, viewType) as AbstractViewHolder<BaseItemModel>
    }

    override fun onBindViewHolder(holder: AbstractViewHolder<BaseItemModel>, position: Int) {
        holder.bind(items.get(position))
    }

    override fun getItemCount(): Int = items.size

    private fun inflateItem(viewGroup: ViewGroup, viewType: Int) : View{
        return LayoutInflater.from(viewGroup.context).inflate(viewType, viewGroup, false)
    }

    override fun getItemViewType(position: Int): Int {
        return items.get(position).type(adapterTypeFactory)
    }

    fun addItems(items : List<BaseItemModel>){
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    fun removeItem(item: BaseItemModel) {
        this.items.remove(item)
        notifyDataSetChanged()
    }
}