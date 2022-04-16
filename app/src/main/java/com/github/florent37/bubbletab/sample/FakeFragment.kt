package com.github.florent37.bubbletab.sample

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.florent37.bubbletab.sample.R
import androidx.recyclerview.widget.GridLayoutManager
import com.github.florent37.bubbletab.sample.FakeFragment

/**
 * Created by florentchampigny on 13/07/2016.
 */
class FakeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bubbletab_page, container, false)
    }

    companion object {
        fun newInstance(): Fragment {
            return FakeFragment()
        }
    }
}