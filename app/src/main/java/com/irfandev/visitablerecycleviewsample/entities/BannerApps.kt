package com.irfandev.visitablerecycleviewsample.entities

import com.irfandev.visitablerecycleviewsample.appfactory.ItemTypeFactory
import com.irfandev.visitablerecycleviewsample.baseconfig.BaseItemModel


/**
 *   created by Irfan Assidiq
 *   email : assidiq.irfan@gmail.com
 **/
data class BannerApps(val title : String, val description : String) : BaseItemModel(){
    override fun type(typeFactory: ItemTypeFactory): Int {
        TODO("Not yet implemented")
    }

}
