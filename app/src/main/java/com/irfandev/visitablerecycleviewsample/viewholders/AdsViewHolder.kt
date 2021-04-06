package com.irfandev.visitablerecycleviewsample.viewholders

import android.view.View
import com.irfandev.visitablerecycleviewsample.R
import com.irfandev.visitablerecycleviewsample.baseconfig.AbstractViewHolder
import com.irfandev.visitablerecycleviewsample.entities.BannerApps
import kotlinx.android.synthetic.main.item_ads.view.*


/**
 *   created by Irfan Assidiq
 *   email : assidiq.irfan@gmail.com
 **/
class AdsViewHolder(view : View) : AbstractViewHolder<BannerApps>(view) {
    private val tvTitle = view.tvTitle
    private val tvSubtitle = view.tvSubTitle
    override fun bind(element: BannerApps) {
        tvTitle.text = element.title
        tvSubtitle.text = element.description
    }

    companion object{
        val LAYOUT = R.layout.item_ads
    }
}