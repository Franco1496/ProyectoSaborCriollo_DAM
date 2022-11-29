package com.example.proyectosaborcriollo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.proyectosaborcriollo.databinding.FragmentLoginBinding
import com.example.proyectosaborcriollo.repository.UsuarioRepositorio
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null

    private val binding get() = _binding!!

    private val userRepositorio = UsuarioRepositorio()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnRegistrarse = requireView().findViewById<Button>(R.id.btnRegistrarse)
        val btnIngresar = requireView().findViewById<Button>(R.id.btnIngresar)

        btnRegistrarse.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_login_to_registroFragment)
        }

        binding.btnIngresar.setOnClickListener {
            iniciarSesion()
        }
    }

    private fun iniciarSesion() {
        val usuario = binding.idCorreoLogin.text.toString()
        val contraseña = binding.idContrasenaLogin.text.toString()

        if (usuario.isEmpty() || contraseña.isEmpty()) {
            showMessage("Por favor ingrese todos los datos")
        } else {
            binding.btnIngresar.isEnabled = false
            GlobalScope.launch {
                val inicioSesion = userRepositorio.iniciarSesion(usuario, contraseña)

                withContext(Dispatchers.Main) {
                    if (inicioSesion) {
                        findNavController().navigate(R.id.action_fragment_login_to_pedidoFragment)
                    } else {
                        showMessage("fallo el inicio de sesion")
                        binding.btnIngresar.isEnabled = true
                    }
                }
            }
        }
    }

    fun showMessage(mensaje: String) {
        Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show()
    }

}