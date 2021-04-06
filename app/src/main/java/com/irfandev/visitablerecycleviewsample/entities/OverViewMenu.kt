package com.irfandev.visitablerecycleviewsample.entities

import com.irfandev.visitablerecycleviewsample.appfactory.ItemTypeFactory
import com.irfandev.visitablerecycleviewsample.baseconfig.BaseItemModel


/**
 *   created by Irfan Assidiq
 *   email : assidiq.irfan@gmail.com
 **/
data class OverViewMenu(
    val market : Menu,
    val pay : Menu,
    val history : Menu,
    val profile : Menu
) : BaseItemModel(){
    override fun type(typeFactory: ItemTypeFactory): Int {
        return typeFactory.type(this)
    }

}
