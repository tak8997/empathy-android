package com.empathy.empathy_android.ui.feed

import android.content.Intent
import android.os.Bundle
import com.empathy.empathy_android.BaseActivity
import com.empathy.empathy_android.R
import com.empathy.empathy_android.ui.tmap.MapActivity
import kotlinx.android.synthetic.main.activity_feed.*

internal class FeedActivity : BaseActivity<FeedViewModel.ViewModel>() {

    override fun getLayoutRes(): Int = R.layout.activity_feed
    override fun getViewModel(): Class<FeedViewModel.ViewModel> = FeedViewModel.ViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        t_map.setOnClickListener {
            startActivity(Intent(this, MapActivity::class.java))
        }
    }

}
