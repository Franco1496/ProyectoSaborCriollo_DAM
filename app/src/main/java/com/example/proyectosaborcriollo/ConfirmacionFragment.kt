package com.example.proyectosaborcriollo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.proyectosaborcriollo.databinding.FragmentConfirmacionBinding
import com.example.proyectosaborcriollo.ui.main.adapter.PagoAdapter
import com.example.proyectosaborcriollo.viewmodel.DetallePagoApplication
import com.example.proyectosaborcriollo.viewmodel.DetallePagoViewModel
import com.example.proyectosaborcriollo.viewmodel.ViewModelFactory

class ConfirmacionFragment : Fragment(R.layout.fragment_confirmacion) {

    private var _binding : FragmentConfirmacionBinding? = null
    val binding get() = _binding !!

    private val detallePagoViewModel: DetallePagoViewModel by viewModels {
        val detalleApp = requireActivity().application as DetallePagoApplication

        ViewModelFactory(detalleApp.repo)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentConfirmacionBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val detepagoAdapter = PagoAdapter(){ detClick ->
            val directions = ConfirmacionFragmentDirections.actionConfirmacionFragmentToPagoFragment()
            findNavController().navigate(directions)

        }


        binding.rvConfirmacion.adapter = detepagoAdapter

        detallePagoViewModel.todoLosDetallePago.observe(viewLifecycleOwner) { lista ->
            detepagoAdapter.cargarlista(lista)

        }



    }
}
