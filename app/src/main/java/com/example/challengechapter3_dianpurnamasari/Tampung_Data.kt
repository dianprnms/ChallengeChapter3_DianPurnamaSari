package com.example.challengechapter3_dianpurnamasari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter3_dianpurnamasari.databinding.ActivityMainBinding
import com.example.challengechapter3_dianpurnamasari.databinding.FragmentTampungDataBinding

class Tampung_Data : Fragment() {
    lateinit var binding: FragmentTampungDataBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTampungDataBinding.inflate(layoutInflater)
        return (binding.root)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listHuruf = arrayListOf(
            HurufKu("A", arrayListOf("Ayam", "Angsa", "Anggur", "Azab", "Atas")),
            HurufKu("B", arrayListOf("Bebek", "Bangau", "Bunga", "Balon", "Burung")),
            HurufKu("C", arrayListOf("Cicak", "Cuka", "Celana", "Cakep", "Cantik")),
            HurufKu("D", arrayListOf("Dunia", "Danau", "Domba", "Duka", "Duku")),
            HurufKu("E", arrayListOf("Elang", "Entok", "Ember")),
            HurufKu("F", arrayListOf("Faktor", "Fantasi", "Film")),
            HurufKu("G", arrayListOf("Gajah", "Gulung", "Gunting", "Gula", "Ganteng")),
            HurufKu("H", arrayListOf("Harimau", "Haus", "Harus")),
            HurufKu("I", arrayListOf("Ikan", "Induk", "Indah")),
            HurufKu("J", arrayListOf("Jauh", "Jerapah", "Jarak")),
            HurufKu("K", arrayListOf("Kalung", "Kuda", "Kantung")),
            HurufKu("L", arrayListOf("Loading", "Lari", "Landak")),
            HurufKu("M", arrayListOf("Mabar", "Masak", "Musang")),
            HurufKu("N", arrayListOf("Nyamuk", "Nangka", "Nanas", "Nasi")),
            HurufKu("O", arrayListOf("Orang", "Oncom", "Oli")),
            HurufKu("P", arrayListOf("Panda", "Payung", "Panci", "Pisang")),
            HurufKu("Q", arrayListOf("Quran", "Qariah", "Qiraah", "Qiraat")),
            HurufKu("R", arrayListOf("Risol", "Rusa", "Rusia", "Roda")),
            HurufKu("S", arrayListOf("Sepatu", "Sop", "Sisir", "Susu", "Soda")),
            HurufKu("T", arrayListOf("Tikus", "Tokek", "Tidur")),
            HurufKu("U", arrayListOf("Unta", "Uang", "Urang", "Usang")),
            HurufKu("V", arrayListOf("Validasi", "Vakuol", "Vacum")),
            HurufKu("W", arrayListOf("Wacana", "Wajah", "Wajar", "Wajan", "Wafat")),
            HurufKu("X", arrayListOf("Xerofit", "Xenon", "Xilem", "Xilofon")),
            HurufKu("Y", arrayListOf("Yoyo", "Yudisium", "Yahudi", "Yang")),
            HurufKu("Z", arrayListOf("Zebra", "Ziarah", "Zat", "Zero", "Zeolit"))
        )

        // membuat adapter
        val adapter = Adapter_Huruf(listHuruf)

        // membuat layout manager
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        // membuat recyclerView

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv)

        // set layoutManager pada recyclerview
        recyclerView.layoutManager = layoutManager

        //set adapter pada recyclewView
        recyclerView.adapter = adapter


    }
}
