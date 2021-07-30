package com.example.rank.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.rank.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.rank_viewpager_item.*

/**
 * 财富榜fragment
 */
class OneFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflate = inflater.inflate(R.layout.rank_viewpager_item,container,false)
        return inflate
    }

    override fun onStart() {
        super.onStart()
        iv_day_bg.visibility = View.VISIBLE
        iv_week_bg.visibility = View.INVISIBLE
        iv_month_bg.visibility = View.INVISIBLE
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var fragmentList = listOf<Fragment>(rich_rank_day_Fragment(),rich_rank_week_Fragment(),rich_rank_month_Fragment())
        viewpager_rich_rank.adapter = RichRankViewPagerAdapter(childFragmentManager,fragmentList)

        viewpager_rich_rank.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
//                TODO("Not yet implemented")
            }

            override fun onPageSelected(position: Int) {
//                TODO("Not yet implemented")
                when (position) {
                    0 -> {
                        iv_day_bg.visibility = View.VISIBLE
                        iv_week_bg.visibility = View.INVISIBLE
                        iv_month_bg.visibility = View.INVISIBLE
                    }
                    1 -> {
                        iv_day_bg.visibility = View.INVISIBLE
                        iv_week_bg.visibility = View.VISIBLE
                        iv_month_bg.visibility = View.INVISIBLE
                    }
                    2 -> {
                        iv_day_bg.visibility = View.INVISIBLE
                        iv_week_bg.visibility = View.INVISIBLE
                        iv_month_bg.visibility = View.VISIBLE
                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {
//                TODO("Not yet implemented")
            }

        })
    }

    class RichRankViewPagerAdapter(fm:FragmentManager,val fragmentList:List<Fragment>):FragmentPagerAdapter(fm){
        override fun getCount() = fragmentList.size

        override fun getItem(position: Int)= fragmentList[position]

    }
}
