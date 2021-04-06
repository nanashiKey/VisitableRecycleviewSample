package com.irfandev.visitablerecycleviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.irfandev.visitablerecycleviewsample.appfactory.ItemTypeFactoryImpl
import com.irfandev.visitablerecycleviewsample.baseconfig.BaseItemListAdapter
import com.irfandev.visitablerecycleviewsample.entities.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var baseitemListAdapter : BaseItemListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        baseitemListAdapter = BaseItemListAdapter(ItemTypeFactoryImpl())
        rcView.layoutManager = LinearLayoutManager(this)
        rcView.adapter = baseitemListAdapter

        menuOverviews()
        bannerAds()
        highLightItem()

    }

    private fun bannerAds(){
        val bannerApps = listOf(
            BannerApps("NKomics Store", "Banyak hadiah menarik")
        )
        baseitemListAdapter.addItems(bannerApps)
    }

    private fun highLightItem() {
        val highlights = listOf(
            HighLightData(listOf(
                HighLight("Baca Buku", "Literasi"),
                HighLight("Ngoding", "Produk"),
                HighLight("Ngoding", "Produk"),
                HighLight("Ngoding", "Produk"),
                HighLight("Ngoding", "Produk")
            ))
        )
        baseitemListAdapter.addItems(highlights)
    }

    private fun menuOverviews(){
        val overviewmenus = listOf(
            OverViewMenu(
                Menu(R.mipmap.ic_market, "market"),
                Menu(R.mipmap.ic_pay, "pay"),
                Menu(R.mipmap.ic_history, "history"),
                Menu(R.mipmap.ic_user, "profile")
            )
        )
        baseitemListAdapter.addItems(overviewmenus)
    }
}