package com.example.proyectosaborcriollo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData

import androidx.lifecycle.viewModelScope
import com.example.proyectosaborcriollo.entity.DetallePago
import com.example.proyectosaborcriollo.repository.DetallePagoRepositorio
import kotlinx.coroutines.launch


class DetallePagoViewModel(private  val repo:DetallePagoRepositorio):ViewModel() {

    val todoLosDetallePago : LiveData<List<DetallePago>> =  repo.todoDetallePago.asLiveData()

    fun inserta(detallepago: DetallePago){
        viewModelScope.launch { repo.insertar(detallepago) }
    }

    fun edita(detallepago: DetallePago){
        viewModelScope.launch { repo.editar(detallepago) }
    }

    fun elimina(cod: String){
        viewModelScope.launch { repo.eliminar(cod) }
    }
}