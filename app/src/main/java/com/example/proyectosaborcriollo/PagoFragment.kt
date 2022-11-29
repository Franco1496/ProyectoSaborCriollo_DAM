package com.example.proyectosaborcriollo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.proyectosaborcriollo.databinding.FragmentPagoBinding
import com.example.proyectosaborcriollo.entity.DetallePago
import com.example.proyectosaborcriollo.viewmodel.DetallePagoApplication
import com.example.proyectosaborcriollo.viewmodel.DetallePagoViewModel
import com.example.proyectosaborcriollo.viewmodel.ViewModelFactory


class PagoFragment : Fragment() {

    private var _binding : FragmentPagoBinding? = null
    val binding get() = _binding !!

    private val detallePagoViewModel : DetallePagoViewModel by viewModels{
        val detalleApp = requireActivity().application as DetallePagoApplication
        ViewModelFactory(detalleApp.repo)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPagoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnConfirmar.setOnClickListener{

            val cod = binding.txtCodigopago.editableText.toString()
            if (cod.isEmpty()){
                binding.txtCodigopago.error = "Campo requerido"
                return@setOnClickListener
            }else if (cod.length > 5){
                binding.txtCodigopago.error = "Maximo 5 digitos"
                return@setOnClickListener
            }
            val nom = binding.txtCliente.editableText.toString()
            if(nom.isEmpty()){
                binding.txtCliente.error = "Campo requerido"
                return@setOnClickListener
            }
            val rest = binding.txtRestaurante.editableText.toString()
            if(rest.isEmpty()){
                binding.txtRestaurante.error = "Campo requerido"
                return@setOnClickListener
            }

            val sutot = binding.txtSubtotal.editableText.toString()
            if(sutot.isEmpty()){
                binding.txtSubtotal.error = "Campo requerido"
                return@setOnClickListener
            }else if (!esNumero(sutot)){
                binding.txtSubtotal.error = "Campo solo numérico"
                return@setOnClickListener
            }
            val igv = binding.txtIgv.editableText.toString()
            if (igv.isEmpty()){
                binding.txtIgv.error = " Campo Requerido"
                return@setOnClickListener
            }else if (!esNumero(igv)){
                binding.txtIgv.error = "Campo solo numérico"
                return@setOnClickListener

            }
            val totav = binding.txtTotalventa.editableText.toString()
            if (totav.isEmpty()){
                binding.txtTotalventa.error = " Campo Requerido"
                return@setOnClickListener
            }else if (!esNumero(totav)){
                binding.txtTotalventa.error = "Campo solo numérico"
                return@setOnClickListener

            }

            val metpago = binding.txtMetodopago.editableText.toString()
            if(metpago.isEmpty()){
                binding.txtMetodopago.error = "Campo requerido"
                return@setOnClickListener
            }

            Log.i("codigopago",cod);
            Log.i("cliente",nom);
            Log.i("restaurent",rest);
            Log.i("subtotal",sutot);
            Log.i("igv",igv);
            Log.i("totalventa",totav);
            Log.i("metodopagp",metpago);



            val pro = DetallePago(cod,nom,rest,sutot.toInt(),totav.toInt(),igv.toInt(),metpago)
            detallePagoViewModel.inserta(pro)

            val directions = PagoFragmentDirections.actionPagoFragmentToConfirmacionFragment()
            findNavController().navigate(directions)


        }

        }

        fun esNumero(s: String): Boolean {
            return try {
                s.toInt()
                true
            } catch (e: NumberFormatException) {
                false
            }

    }


}