package com.irfandev.visitablerecycleviewsample.entities

import com.irfandev.visitablerecycleviewsample.appfactory.ItemTypeFactory
import com.irfandev.visitablerecycleviewsample.baseconfig.BaseItemModel


/**
 *   created by Irfan Assidiq
 *   email : assidiq.irfan@gmail.com
 **/
data class HighLightData(
    val items : List<HighLight> = listOf()
) : BaseItemModel(){
    override fun type(typeFactory: ItemTypeFactory): Int {
        TODO("Not yet implemented")
    }

}
