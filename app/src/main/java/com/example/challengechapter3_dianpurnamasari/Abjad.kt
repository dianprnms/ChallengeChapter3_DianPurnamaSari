package com.example.challengechapter3_dianpurnamasari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter3_dianpurnamasari.databinding.FragmentAbjadBinding

class Abjad : Fragment() {
  lateinit var binding: FragmentAbjadBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentAbjadBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val getData = arguments?.getStringArrayList("Data")
//        binding.rv2.

//        val listAbjad = arrayListOf(
//            "Abjad", "Ayam", "tes", "test"
//        )
            // membuat adapter
        val adapter = getData?.let { Adapter_Abjad(it) }

        // membuat layout manager
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        // membuat recyclerView

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv2)

        // set layoutManager pada recyclerview
        recyclerView.layoutManager = layoutManager

        //set adapter pada recyclewView
        recyclerView.adapter = adapter



    }

}