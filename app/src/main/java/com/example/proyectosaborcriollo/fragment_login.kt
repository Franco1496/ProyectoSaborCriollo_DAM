package com.example.proyectosaborcriollo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class fragment_login : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnRegistrarse = requireView().findViewById<Button>(R.id.btnRegistrarse)
        val btnIngresar = requireView().findViewById<Button>(R.id.btnIngresar)

        btnRegistrarse.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_login_to_registroFragment)
        }

        btnIngresar.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_login_to_pedidoFragment)
        }




    }

}