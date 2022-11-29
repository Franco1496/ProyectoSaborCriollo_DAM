package com.example.proyectosaborcriollo.ui.main.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.proyectosaborcriollo.databinding.ItemRowpagoBinding
import com.example.proyectosaborcriollo.entity.DetallePago

class PagoViewHolder(val binding: ItemRowpagoBinding) : ViewHolder(binding.root) {

    fun  cargarDatos(detpago:DetallePago){
        binding.lblCliente.text = detpago.cliente
        binding.lblCodigo.text = detpago.codigo
        binding.lblTotal.text = detpago.total_ventas.toString()
        binding.lblMetodoPago.text = detpago.metodo_pago
     //   binding.lblSubTotal.text = detpago.sub_total.toString()
       // binding.lblIGV.text = detpago.igv.toString()
        //binding.lblRestaurante.text = detpago.restaurante
    }
}