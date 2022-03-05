package com.example.viewpage.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpage.fragments.HelloFragment
import com.example.viewpage.fragments.MyInfoFragments
import com.example.viewpage.fragments.MyNameFragments

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        if(position == 0) {
            return "이름"
        }

        else if (position ==1 ) {
            return "내 정보"
        }

        else {
            return "인사말"
        }






    }



    override fun getCount(): Int {
        TODO("Not yet implemented")

        return 3

    }

    override fun getItem(position: Int): Fragment {
        TODO("Not yet implemented")

        if(position == 0) {
            return MyNameFragments()
        }

        else if (position ==1) {
            return MyInfoFragments()

        }
        else {
            return HelloFragment()

        }
    }
}