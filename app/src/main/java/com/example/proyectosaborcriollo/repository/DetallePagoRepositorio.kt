package com.example.proyectosaborcriollo.repository

import com.example.proyectosaborcriollo.entity.DetallePago
import com.example.proyectosaborcriollo.room.DetallePagoDao

class DetallePagoRepositorio (private val objDao : DetallePagoDao) {

    val todoDetallePago = objDao.obtenerTodoDetallePago()

    suspend fun insertar(detallepago :DetallePago){
        objDao.agregarDetallePago(detallepago)
    }

    suspend fun editar(detallepago: DetallePago){
        objDao.editarDetallePago(detallepago)
    }

    suspend fun eliminar(cod:String){
        objDao.eliminarDetallePago(cod)
    }
}