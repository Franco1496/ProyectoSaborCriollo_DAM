package com.example.proyectosaborcriollo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.proyectosaborcriollo.databinding.FragmentRegistroBinding
import com.example.proyectosaborcriollo.repository.UsuarioRepositorio
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RegistroFragment : Fragment() {

    private var _binding: FragmentRegistroBinding? = null

    private val binding get() = _binding!!

    private val userRepositorio = UsuarioRepositorio()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegistroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegistrarClie.setOnClickListener {
            registrarUsuario()
        }

        binding.btnRetornoReserva.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    fun registrarUsuario() {
        val usuario = binding.editTextCorreo.text.toString()
        val contraseña = binding.editTextContrasena.text.toString()

        if (usuario.isEmpty() || contraseña.isEmpty()) {
            showMessage("Por favor ingrese todos los datos")
        } else {
            binding.btnRegistrarClie.isEnabled = false
            GlobalScope.launch {
                val inicioSesion = userRepositorio.registrarUsuario(usuario, contraseña)

                withContext(Dispatchers.Main) {
                    if (inicioSesion) {
                        findNavController().navigate(R.id.action_registroFragment_to_fragment_login)
                    } else {
                        showMessage("fallo el registro de usuario")
                        binding.btnRegistrarClie.isEnabled = true
                    }
                }
            }
        }
    }

    fun showMessage(mensaje: String) {
        Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show()
    }
}