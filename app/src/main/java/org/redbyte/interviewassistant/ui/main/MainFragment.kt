package org.redbyte.interviewassistant.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import org.redbyte.interviewassistant.R

class MainFragment : Fragment(R.layout.fragment_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object {
        fun newInstance() = MainFragment()
    }

}