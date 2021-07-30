package com.example.rank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.rank.fragment.OneFragment
import com.example.rank.fragment.TwoFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.viewpager
import kotlinx.android.synthetic.main.rank_viewpager_item.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragmentList = listOf<Fragment>(OneFragment(), TwoFragment())
        viewpager.adapter = ViewPagerAdapter(supportFragmentManager,fragmentList)

        viewpager.setOnPageChangeListener(object:ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
//                TODO("Not yet implemented")
            }

            override fun onPageSelected(position: Int) {
//                TODO("Not yet implemented")
                if(position==1){
                    iv_charm_title_bg.visibility = View.VISIBLE
                    iv_rich_title_bg.visibility = View.INVISIBLE
                }else if(position==0){
                    iv_charm_title_bg.visibility = View.INVISIBLE
                    iv_rich_title_bg.visibility = View.VISIBLE
                }
            }

            override fun onPageScrollStateChanged(state: Int) {
//                TODO("Not yet implemented")
            }
        })

    }

    override fun onStart() {
        super.onStart()
        iv_charm_title_bg.visibility = View.INVISIBLE
    }

    class ViewPagerAdapter(fm: FragmentManager, var fragmentList: List<Fragment>) : FragmentPagerAdapter(fm) {
        override fun getCount(): Int {
//            TODO("Not yet implemented")
            return fragmentList.size
        }

        override fun getItem(position: Int): Fragment {
//            TODO("Not yet implemented")
            return fragmentList.get(position)
        }

    }
}