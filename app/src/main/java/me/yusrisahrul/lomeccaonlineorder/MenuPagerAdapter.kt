package me.yusrisahrul.lomeccaonlineorder

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MenuPagerAdapter (private val mContext: Context, fm : FragmentManager) :
FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.food, R.string.beverage,
            R.string.dessert)
    }

    override fun getItem(position: Int): Fragment =
        when (position) {
            0 -> FoodFragment()
            1 -> BeverageFragment()
            2 -> DessertFragment()
            else -> Fragment()
        }

    override fun getCount(): Int = 3

    override fun getPageTitle(position: Int): CharSequence? =
        mContext.resources.getString(TAB_TITLES[position])

}