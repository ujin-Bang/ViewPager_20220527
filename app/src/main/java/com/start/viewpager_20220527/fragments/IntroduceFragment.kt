package com.start.viewpager_20220527.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.start.viewpager_20220527.R
import com.start.viewpager_20220527.databinding.FragmentHelloBinding
import com.start.viewpager_20220527.databinding.FragmentIntroduceBinding
import com.start.viewpager_20220527.databinding.FragmentNameBinding

class IntroduceFragment: Fragment() {

    lateinit var binding: FragmentIntroduceBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_introduce, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}