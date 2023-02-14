package com.example.test.presentation.fragments.blank_fragment

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.test.R
import com.example.test.databinding.FragmentBlankBinding
import com.example.test.presentation.base.BaseFragment

class BlankFragment : BaseFragment(R.layout.fragment_blank) {

    private val viewBinding by viewBinding(FragmentBlankBinding::bind)

}