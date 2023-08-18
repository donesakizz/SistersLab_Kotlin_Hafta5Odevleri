package com.example.hafta5odevleri

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.hafta5odevleri.databinding.OyuncakItemBinding

class OyuncakAdapter(private val mContext: Context, private val oyuncakList: List<Oyuncaklar>)
    : RecyclerView.Adapter<OyuncakAdapter.OyuncaklarViewHolder>(){

    inner class OyuncaklarViewHolder(val binding: OyuncakItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OyuncaklarViewHolder {
       val binding = OyuncakItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return OyuncaklarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OyuncaklarViewHolder, position: Int) {
        val oyuncak = oyuncakList[position]
        val binding = holder.binding
        binding.oyuncakAd.text = oyuncak.Ad
        binding.oyuncakFiyat.text = "${oyuncak.fiyat} TL"
        val resimId = mContext.resources.getIdentifier(oyuncak.Resim, "drawable", mContext.packageName)
        binding.oyuncakImage.setImageResource(resimId)

        binding.oyuncakSatNAlbutton.setOnClickListener {
            Toast.makeText(mContext , "${oyuncak.Ad} satın alınıyor", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return oyuncakList.size
    }

}