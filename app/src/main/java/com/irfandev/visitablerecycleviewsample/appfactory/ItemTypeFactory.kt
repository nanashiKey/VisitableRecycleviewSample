package com.irfandev.visitablerecycleviewsample.appfactory

import android.view.View
import com.irfandev.visitablerecycleviewsample.baseconfig.AbstractViewHolder
import com.irfandev.visitablerecycleviewsample.entities.BannerApps
import com.irfandev.visitablerecycleviewsample.entities.HighLightData
import com.irfandev.visitablerecycleviewsample.entities.OverViewMenu


/**
 *   created by Irfan Assidiq
 *   email : assidiq.irfan@gmail.com
 **/
interface ItemTypeFactory {
    fun type(typeFactory : BannerApps) : Int
    fun type(typeFactory: HighLightData) : Int
    fun type(typeFactory : OverViewMenu) : Int

    fun createViewHolder(parent : View, type : Int ) : AbstractViewHolder<*>

}