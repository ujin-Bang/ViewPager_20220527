package com.start.viewpager_20220527.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.start.viewpager_20220527.fragments.HelloFragment
import com.start.viewpager_20220527.fragments.IntroduceFragment
import com.start.viewpager_20220527.fragments.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        if(position == 0){
            return HelloFragment()
        }
        else if( position == 1) {
            return NameFragment()
        }
        else {
            return IntroduceFragment()
        }
    }
}