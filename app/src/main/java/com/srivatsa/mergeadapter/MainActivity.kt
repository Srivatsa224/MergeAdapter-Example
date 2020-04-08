package com.srivatsa.mergeadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import com.srivatsa.mergeadapter.model.MyDetail
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: MergeAdapter
    lateinit var myDetailAdapter: MyDetailAdapter
    lateinit var userVerticalAdapter: UsersAdapter
    lateinit var bannerAdapter: BannerAdapter
    val myDetail = MyDetail(1, "Srivatsa", "Founder and CEO, PiedPiper ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupDataInRecyclerView()
    }
    private fun setupDataInRecyclerView()
    {
        recyclerView.layoutManager=LinearLayoutManager(this)
        userVerticalAdapter= UsersAdapter(DataSource.getUser())
        bannerAdapter= BannerAdapter(DataSource.getBanner())
        myDetailAdapter= MyDetailAdapter(myDetail)
        adapter=MergeAdapter(myDetailAdapter, userVerticalAdapter, bannerAdapter)
        recyclerView.adapter=adapter
    }
}
