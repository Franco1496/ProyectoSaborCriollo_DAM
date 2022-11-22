package com.example.proyectosaborcriollo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class PedidoFragment : Fragment(R.layout.fragment_pedido) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val btnGenerarReserva = requireView().findViewById<Button>(R.id.btnGenerarReserva)
        val btnFinalizarCompra = requireView().findViewById<Button>(R.id.btnFinalizarCompra)

        btnGenerarReserva.setOnClickListener{
            findNavController().navigate(R.id.action_pedidoFragment_to_reservaFragment)
        }

        btnFinalizarCompra.setOnClickListener{
            findNavController().navigate(R.id.action_pedidoFragment_to_pagoFragment)
        }

    }
}