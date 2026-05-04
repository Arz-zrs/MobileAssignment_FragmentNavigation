package com.example.fragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentnavigation.databinding.FragmentOneBinding

class FragmentOne : Fragment() {
    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        binding.btnNext.setOnClickListener {
            findNavController().navigate(
                FragmentOneDirections.actionFragmentOneToFragmentTwo()
            )
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}