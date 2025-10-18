package com.example.lokmart.presentation.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lokmart.R
import com.example.lokmart.databinding.FragmentOnboardingBinding

class OnboardingFragment : Fragment() {

    private lateinit var binding : FragmentOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingBinding.inflate(inflater)
        return binding.root
    }


}