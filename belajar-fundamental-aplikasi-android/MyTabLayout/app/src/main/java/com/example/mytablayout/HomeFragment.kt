package com.example.mytablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mytablayout.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        val tvlabel: TextView? = binding?.sectionLabel
        val index = arguments?.getInt(ARG_SECTION_NUMBER,0)

        tvlabel?.text = getString(R.string.content_tab_text, index)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    companion object{
        const val ARG_SECTION_NUMBER = "section_number"
    }
}