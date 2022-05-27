package com.start.viewpager_20220527.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.start.viewpager_20220527.R
import com.start.viewpager_20220527.databinding.FragmentHelloBinding
import com.start.viewpager_20220527.databinding.FragmentNameBinding

class NameFragment: Fragment() {

    lateinit var binding: FragmentNameBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_name, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}