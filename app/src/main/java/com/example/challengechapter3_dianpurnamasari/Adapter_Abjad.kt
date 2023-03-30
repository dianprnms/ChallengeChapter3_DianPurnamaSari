package com.example.challengechapter3_dianpurnamasari

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView

class Adapter_Abjad (private val listAbjad:ArrayList<String>)
    : RecyclerView.Adapter<Adapter_Abjad.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val abj = itemView.findViewById<Button>(R.id.btnAbjad)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item__kedua, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listAbjad.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.abj.text = listAbjad[position]
        holder.abj.setOnClickListener(){
           val pindah = Intent(Intent.ACTION_VIEW)
           pindah.data = Uri.parse("https://www.google.com/search?q=" + listAbjad[position])
            holder.abj.context.startActivity(pindah)
        }
   }

}