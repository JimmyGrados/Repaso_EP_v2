package com.joaquin.myapplication.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.joaquin.myapplication.R
import com.joaquin.myapplication.ui.model.HotelModel

class HotelAdapter (private var lstHotel: List<HotelModel>) :
    RecyclerView.Adapter<HotelAdapter.ViewHolder>()
    {

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val ivHotel: ImageView = itemView.findViewById(R.id.ivHotel)
            val tvName: TextView = itemView.findViewById(R.id.tvName)
            val tvCalificacion: TextView = itemView.findViewById(R.id.tvCalificacion)
            val tvDireciton: TextView = itemView.findViewById(R.id.tvDirection)
            val tvPrice: TextView = itemView.findViewById(R.id.tvPrice)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return ViewHolder(
                layoutInflater.inflate(
                    R.layout.item_hotel, parent, false
                )
            )
        }

        override fun getItemCount(): Int {
            return lstHotel.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val itemHotel = lstHotel[position]
            holder.ivHotel.setImageResource(itemHotel.imagen)
            holder.tvName.text = itemHotel.nombre
            holder.tvDireciton.text = itemHotel.direc
            holder.tvCalificacion.text = itemHotel.calificacion
            holder.tvPrice.text = itemHotel.costo
        }
    }