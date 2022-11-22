package com.example.proyectosaborcriollo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class RegistroFragment : Fragment(R.layout.fragment_registro) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnRegistrarClie = requireView().findViewById<Button>(R.id.btnRegistrarClie)

        btnRegistrarClie.setOnClickListener{
            findNavController().navigate(R.id.action_registroFragment_to_fragment_login)
        }
    }

}