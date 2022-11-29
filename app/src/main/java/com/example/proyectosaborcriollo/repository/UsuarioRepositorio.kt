package com.example.proyectosaborcriollo.repository

import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.tasks.await

class UsuarioRepositorio {

    private val firebaseAuth = FirebaseAuth.getInstance()

    suspend fun iniciarSesion(usuario: String, contrasena: String): Boolean {
        return try {
            firebaseAuth.signInWithEmailAndPassword(usuario, contrasena).await()
            true
        } catch (throwable: Throwable) {
            false
        }

    }
}