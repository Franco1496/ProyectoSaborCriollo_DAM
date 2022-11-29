package com.example.proyectosaborcriollo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.proyectosaborcriollo.repository.DetallePagoRepositorio

class ViewModelFactory(private  val repo: DetallePagoRepositorio) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetallePagoViewModel::class.java)){
            return DetallePagoViewModel(repo) as T
        }

        throw IllegalArgumentException("ViewModel no encontrado")
    }
}