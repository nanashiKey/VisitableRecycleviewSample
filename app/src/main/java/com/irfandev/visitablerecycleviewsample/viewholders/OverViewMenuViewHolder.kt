package com.irfandev.visitablerecycleviewsample.viewholders

import android.view.View
import com.irfandev.visitablerecycleviewsample.R
import com.irfandev.visitablerecycleviewsample.baseconfig.AbstractViewHolder
import com.irfandev.visitablerecycleviewsample.entities.Menu
import com.irfandev.visitablerecycleviewsample.entities.OverViewMenu
import kotlinx.android.synthetic.main.item_menuoverview.view.*


/**
 *   created by Irfan Assidiq
 *   email : assidiq.irfan@gmail.com
 **/
class OverViewMenuViewHolder(view : View) : AbstractViewHolder<OverViewMenu>(view) {
    private val imgMarket = view.imgMarket
    private val tvTitleMarket = view.tvTitleMarket
    private fun setbtnMarket(market : Menu){
        imgMarket.setImageResource(market.icon)
        tvTitleMarket.text = market.title
    }

    private val imgPay = view.imgPay
    private val tvTitlePay = view.tvTitlePay
    private fun setBtnPay(pay : Menu){
        imgPay.setImageResource(pay.icon)
        tvTitlePay.text = pay.title
    }

    private val imgHistory = view.imgHistory
    private val tvTitleHistory = view.tvTitleHistory
    private fun setBtnHistory(history : Menu){
        imgHistory.setImageResource(history.icon)
        tvTitleHistory.text = history.title
    }

    private val imgProfile = view.imgUser
    private val tvTitleProfile = view.tvTitleUser
    private fun setBtnProfile(profile : Menu){
        imgProfile.setImageResource(profile.icon)
        tvTitleProfile.text = profile.title
    }

    override fun bind(element: OverViewMenu) {
        setbtnMarket(element.market)
        setBtnHistory(element.history)
        setBtnPay(element.pay)
        setBtnProfile(element.profile)
    }


    companion object{
        val LAYOUT = R.layout.item_menuoverview
    }

}