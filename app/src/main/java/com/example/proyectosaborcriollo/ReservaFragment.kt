package com.example.proyectosaborcriollo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ReservaFragment : Fragment(R.layout.fragment_reserva) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnRetornoReserva = requireView().findViewById<FloatingActionButton>(R.id.btnRetornoReserva)

        btnRetornoReserva.setOnClickListener{
            findNavController().navigate(R.id.action_reservaFragment_to_pedidoFragment)
        }
    }

}