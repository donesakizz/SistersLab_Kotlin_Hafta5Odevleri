package com.example.hafta5odevleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.hafta5odevleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var oyuncakAdapter: OyuncakAdapter
    private lateinit var oyuncakList: ArrayList<Oyuncaklar>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = StaggeredGridLayoutManager(3 ,StaggeredGridLayoutManager.HORIZONTAL)
        ekleListe()
    }

    private fun ekleListe(){
        val oyuncak1 = Oyuncaklar(1, "Peluş Arı", 145.5, "oyuncak_arimaya")
        val oyuncak2 = Oyuncaklar(2, "Peluş  Aslan", 150.2, "oyuncak_aslan")
        val oyuncak3 = Oyuncaklar(3, "Oyuncak Gemi", 110.2, "oyuncak_gemi")
        val oyuncak4 = Oyuncaklar(4, "Peluş  Kedi", 115.5, "oyuncak_kedi")
        val oyuncak5 = Oyuncaklar(5, "Sarı Kepçe ", 111.5, "oyuncak_kepce")
        val oyuncak6 = Oyuncaklar(6, "Lego Oyuncaklar", 211.5, "oyuncak_legoninjago")
        val oyuncak7 = Oyuncaklar(7, "Pepee Oyuncak", 45.225, "oyuncak_pepee")
        val oyuncak8 = Oyuncaklar(8, "Sari Araba ", 45.5, "oyuncak_sariaraba")
        val oyuncak9 = Oyuncaklar(9, "Oyuncak Traktor ", 105.5, "oyuncak_traktor")

        oyuncakList = ArrayList<Oyuncaklar>()
        oyuncakList.add(oyuncak1)
        oyuncakList.add(oyuncak2)
        oyuncakList.add(oyuncak3)
        oyuncakList.add(oyuncak4)
        oyuncakList.add(oyuncak5)
        oyuncakList.add(oyuncak6)
        oyuncakList.add(oyuncak7)
        oyuncakList.add(oyuncak8)
        oyuncakList.add(oyuncak9)

        oyuncakAdapter = OyuncakAdapter(this,oyuncakList)
        binding.rv.adapter = oyuncakAdapter


    }
}