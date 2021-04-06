package com.irfandev.visitablerecycleviewsample.appfactory

import android.view.View
import com.irfandev.visitablerecycleviewsample.baseconfig.AbstractViewHolder
import com.irfandev.visitablerecycleviewsample.entities.BannerApps
import com.irfandev.visitablerecycleviewsample.entities.HighLightData
import com.irfandev.visitablerecycleviewsample.entities.OverViewMenu
import com.irfandev.visitablerecycleviewsample.viewholders.AdsViewHolder
import com.irfandev.visitablerecycleviewsample.viewholders.HighlightDataViewHolder
import com.irfandev.visitablerecycleviewsample.viewholders.OverViewMenuViewHolder


/**
 *   created by Irfan Assidiq
 *   email : assidiq.irfan@gmail.com
 **/
class ItemTypeFactoryImpl : ItemTypeFactory {
    override fun type(typeFactory: BannerApps): Int = AdsViewHolder.LAYOUT

    override fun type(typeFactory: HighLightData): Int = HighlightDataViewHolder.LAYOUT

    override fun type(typeFactory: OverViewMenu): Int = OverViewMenuViewHolder.LAYOUT

    override fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*> {
       return when(type){
           HighlightDataViewHolder.LAYOUT -> HighlightDataViewHolder(parent)
           OverViewMenuViewHolder.LAYOUT -> OverViewMenuViewHolder(parent)
           AdsViewHolder.LAYOUT -> AdsViewHolder(parent)
           else -> createViewHolder(parent, type)
       }
    }
}