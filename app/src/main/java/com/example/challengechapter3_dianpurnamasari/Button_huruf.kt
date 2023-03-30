package com.example.challengechapter3_dianpurnamasari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.challengechapter3_dianpurnamasari.databinding.FragmentButtonHurufBinding


class Button_huruf : Fragment(){
    lateinit var binding: FragmentButtonHurufBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentButtonHurufBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.btn.setOnClickListener {
//            findNavController().navigate(R.id.)
//        }
    }

}