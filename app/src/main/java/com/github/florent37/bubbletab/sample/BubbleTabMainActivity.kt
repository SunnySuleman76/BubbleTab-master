package com.github.florent37.bubbletab.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.florent37.bubbletab.sample.R
import com.github.florent37.bubbletab.BubbleTab
import androidx.viewpager.widget.ViewPager
import com.github.florent37.bubbletab.sample.FakeAdapter

class BubbleTabMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bubbletab_activity_main)
        val bubbleTab = findViewById<BubbleTab>(R.id.bubbleTab)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = FakeAdapter(supportFragmentManager, 1)
        bubbleTab.setupWithViewPager(viewPager)
    }
}