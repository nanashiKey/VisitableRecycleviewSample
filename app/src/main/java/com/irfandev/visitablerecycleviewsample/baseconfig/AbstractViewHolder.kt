package com.irfandev.visitablerecycleviewsample.baseconfig

import android.view.View
import androidx.recyclerview.widget.RecyclerView


/**
 *   created by Irfan Assidiq
 *   email : assidiq.irfan@gmail.com
 **/
abstract class AbstractViewHolder<in T>
    (private val view : View) : RecyclerView.ViewHolder(view) {

        abstract fun bind(element : T)
}