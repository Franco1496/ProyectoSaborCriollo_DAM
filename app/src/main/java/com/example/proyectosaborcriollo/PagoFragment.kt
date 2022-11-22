package com.example.proyectosaborcriollo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class PagoFragment : Fragment(R.layout.fragment_pago) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    val btnRetornoPago = requireView().findViewById<FloatingActionButton>(R.id.btnRetornoPago)


    btnRetornoPago.setOnClickListener{
        findNavController().navigate(R.id.action_pagoFragment_to_pedidoFragment)
    }


    }
}