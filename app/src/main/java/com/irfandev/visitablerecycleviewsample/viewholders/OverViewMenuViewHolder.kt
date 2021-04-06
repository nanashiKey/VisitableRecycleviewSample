package com.irfandev.visitablerecycleviewsample.viewholders

import android.content.Intent
import android.view.View
import android.widget.Toast
import com.irfandev.visitablerecycleviewsample.AfterActivity
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
        imgMarket.setOnClickListener{
            Toast.makeText(itemView.context, "market item", Toast.LENGTH_SHORT).show()
            itemView.context.startActivity(Intent(itemView.context, AfterActivity::class.java))
        }
    }

    private val imgPay = view.imgPay
    private val tvTitlePay = view.tvTitlePay
    private fun setBtnPay(pay : Menu){
        imgPay.setImageResource(pay.icon)
        tvTitlePay.text = pay.title
        imgPay.setOnClickListener {
            Toast.makeText(itemView.context, "pay item", Toast.LENGTH_SHORT).show()
        }
    }

    private val imgHistory = view.imgHistory
    private val tvTitleHistory = view.tvTitleHistory
    private fun setBtnHistory(history : Menu){
        imgHistory.setImageResource(history.icon)
        tvTitleHistory.text = history.title
        imgHistory.setOnClickListener {
            Toast.makeText(itemView.context, "history item", Toast.LENGTH_SHORT).show()
        }
    }

    private val imgProfile = view.imgUser
    private val tvTitleProfile = view.tvTitleUser
    private fun setBtnProfile(profile : Menu){
        imgProfile.setImageResource(profile.icon)
        tvTitleProfile.text = profile.title
        imgProfile.setOnClickListener {
            Toast.makeText(itemView.context, "profile item", Toast.LENGTH_SHORT).show()
        }
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