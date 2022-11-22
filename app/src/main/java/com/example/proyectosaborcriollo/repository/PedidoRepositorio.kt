package com.example.proyectosaborcriollo.repository

import com.example.proyectosaborcriollo.entity.Pedido
import com.example.proyectosaborcriollo.room.PedidoDAO

class PedidoRepositorio (private val dao: PedidoDAO){

    val todosLosPedidos = dao.obtenerPedido()

    /*suspend fun insertar(pedido: Pedido) {
        dao.RegistrarPedido(pedido)
    }*/
}