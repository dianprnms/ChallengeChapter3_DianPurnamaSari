package com.example.challengechapter3_dianpurnamasari

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView

class Adapter_Huruf (private val listHuruf:ArrayList<HurufKu>)
    : RecyclerView.Adapter<Adapter_Huruf.ViewHolder>(){
        //class Holder
        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val hrf = itemView.findViewById<Button>(R.id.btn)
        }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_button_huruf, parent, false)
            return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listHuruf.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.hrf.text = listHuruf[position].hrf
        holder.hrf.setOnClickListener(){
        val bund = Bundle()
        val data = listHuruf[position].arr
        bund.putStringArrayList("Data", data)
            Toast.makeText(holder.itemView.context, "Huruf : ${listHuruf[position].hrf}", Toast.LENGTH_SHORT).show()
            Navigation.createNavigateOnClickListener(R.id.action_tampung_Data2_to_abjad, bund).onClick(holder.itemView)
        }
    }
    }
