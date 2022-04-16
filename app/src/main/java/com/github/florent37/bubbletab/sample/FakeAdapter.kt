package com.github.florent37.bubbletab.sample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.github.florent37.bubbletab.sample.FakeFragment

class FakeAdapter(fm: FragmentManager?, behavior: Int) : FragmentStatePagerAdapter(
    fm!!, behavior
) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            else -> FakeFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return 5
    }
}