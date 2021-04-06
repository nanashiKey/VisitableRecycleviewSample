package com.irfandev.visitablerecycleviewsample.baseconfig

import com.irfandev.visitablerecycleviewsample.appfactory.ItemTypeFactory


/**
 *   created by Irfan Assidiq
 *   email : assidiq.irfan@gmail.com
 **/
abstract class BaseItemModel{
    abstract fun type(typeFactory: ItemTypeFactory) : Int
}
