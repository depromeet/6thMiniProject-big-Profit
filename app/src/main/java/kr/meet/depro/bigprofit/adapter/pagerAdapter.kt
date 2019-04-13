package com.depromeet.dog1plus1benefit

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class pagerAdapter : FragmentPagerAdapter{

    var page1 : Fragment = list1()
    var page2 : Fragment = list2()
    var pageAll : Fragment = list_all()
    var pageArray : ArrayList<Fragment> = arrayListOf(page1,page2,pageAll)
    var pageTitleArray : ArrayList<String> = arrayListOf("1+1","2+1","ALL")


    constructor(fm : FragmentManager) : super(fm){
    }

    override fun getItem(p0: Int): Fragment? {
        return pageArray.get(p0)
    }
    override fun getCount(): Int {
        return pageArray.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return pageTitleArray.get(position)
    }
}