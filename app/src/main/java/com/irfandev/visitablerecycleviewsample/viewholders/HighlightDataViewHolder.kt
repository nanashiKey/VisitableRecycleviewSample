package com.irfandev.visitablerecycleviewsample.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.irfandev.visitablerecycleviewsample.R
import com.irfandev.visitablerecycleviewsample.baseconfig.AbstractViewHolder
import com.irfandev.visitablerecycleviewsample.entities.HighLight
import com.irfandev.visitablerecycleviewsample.entities.HighLightData
import kotlinx.android.synthetic.main.item_highlight.view.*
import kotlinx.android.synthetic.main.item_highlightoverview.view.*


/**
 *   created by Irfan Assidiq
 *   email : assidiq.irfan@gmail.com
 **/
class HighlightDataViewHolder(view : View) : AbstractViewHolder<HighLightData>(view) {
    private lateinit var adapter : HighlightAdapter
    private var rcView = view.rcView
    override fun bind(element: HighLightData) {
        adapter = HighlightAdapter(items = element.items)
        rcView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        rcView.adapter = adapter
    }

    class HighlightAdapter(private val items : List<HighLight>)
        : RecyclerView.Adapter<HighlightAdapter.HighlightViewHolder>(){

        class HighlightViewHolder(view : View) : RecyclerView.ViewHolder(view){
            private val tvTitle = view.tvTitle
            private val tvSubtitle = view.tvSubTitle

            fun bind(highLight: HighLight){
                tvTitle.text = highLight.title
                tvSubtitle.text = highLight.tag
            }
            companion object{
                fun inflate(viewgroup : ViewGroup): HighlightViewHolder{
                    val xview = LayoutInflater
                        .from(viewgroup.context)
                        .inflate(R.layout.item_highlight, viewgroup, false)
                    return  HighlightViewHolder(xview)
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HighlightViewHolder {
            return HighlightViewHolder.inflate(parent)
        }

        override fun onBindViewHolder(holder: HighlightViewHolder, position: Int) {
            holder.bind(items.get(position))
        }

        override fun getItemCount(): Int = items.size
    }

    companion object{
        val LAYOUT = R.layout.item_highlightoverview
    }
}