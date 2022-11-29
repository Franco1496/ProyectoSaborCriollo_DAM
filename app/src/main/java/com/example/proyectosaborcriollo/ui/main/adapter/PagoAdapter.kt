package com.example.proyectosaborcriollo.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.proyectosaborcriollo.databinding.ItemRowpagoBinding
import com.example.proyectosaborcriollo.entity.DetallePago

class PagoAdapter (val onClick: (DetallePago) -> Unit): Adapter<PagoViewHolder>() {

    private var lista = ArrayList<DetallePago>()

    fun cargarlista(list:List<DetallePago>){
        lista.addAll(list)
        notifyDataSetChanged()
    }

    fun cargarObjeto(pro : DetallePago){
        lista.add(pro)
        notifyItemInserted(lista.size - 1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagoViewHolder {
        val binding = ItemRowpagoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PagoViewHolder(binding)
    }


    override fun onBindViewHolder(holder: PagoViewHolder, position: Int) {
        val pro = lista[position]
        holder.cargarDatos(pro)
        holder.itemView.setOnClickListener{
            onClick(pro)
        }
    }
    override fun getItemCount(): Int {
        return lista.size
    }
}